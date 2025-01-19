package com.tatari.vidai.presentation.water_reminder

import android.content.Context
import androidx.lifecycle.viewModelScope
import com.tatari.vidai.common.getCurrentTime
import com.tatari.vidai.data.repository.Repository
import com.tatari.vidai.data.room.DietDatabase
import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WaterReminderViewModel @Inject constructor(@ApplicationContext context: Context) :
    BaseViewModel<WaterReminderEvent, WaterReminderState, WaterReminderEffect>() {

    private val database = DietDatabase.getDatabase(context)
    private val repository = Repository(database.dietDao())

    override fun setInitialState(): WaterReminderState {
        return WaterReminderState()
    }

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getCurrentWaterReminder()?.collectLatest {
                val currentTime = getCurrentTime()
                val currentIntake = it.find { waterReminder -> waterReminder.time == currentTime }
                setState { copy(currentIntake = currentIntake?.currentIntake ?: 0) }
            }
        }
    }

    override fun handleEvents(event: WaterReminderEvent) {
        when (event) {
            WaterReminderEvent.OnBackClicked -> {
                setEffect { WaterReminderEffect.NavigateBack }
            }

            WaterReminderEvent.OnAddIntakeClicked -> {
                val currentIntake = getCurrentState().currentIntake + 250
                viewModelScope.launch(Dispatchers.IO) {
                    repository.insertWaterReminder(currentIntake)
                }
            }

            WaterReminderEvent.OnRemoveIntakeClicked -> {
                val currentIntake = getCurrentState().currentIntake - 250
                viewModelScope.launch(Dispatchers.IO) {
                    repository.insertWaterReminder(currentIntake)
                }
            }
        }
    }
}

sealed interface WaterReminderEvent : Event {
    data object OnBackClicked : WaterReminderEvent
    data object OnAddIntakeClicked : WaterReminderEvent
    data object OnRemoveIntakeClicked : WaterReminderEvent
}

data class WaterReminderState(
    val isLoading: Boolean = false,
    val currentIntake: Int = 0,
) : State

sealed interface WaterReminderEffect : Effect {
    data object NavigateBack : WaterReminderEffect
}
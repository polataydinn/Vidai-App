package com.tatari.vidai.presentation.weight_tracker

import android.content.Context
import androidx.lifecycle.viewModelScope
import com.tatari.vidai.common.getDay
import com.tatari.vidai.data.repository.Repository
import com.tatari.vidai.data.room.DietDatabase
import com.tatari.vidai.data.room.WeightTracker
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
class WeightTrackerViewModel @Inject constructor(
    @ApplicationContext private val context: Context
) :
    BaseViewModel<WeightTrackerEvent, WeightTrackerState, WeightTrackerEffect>() {

    private val database = DietDatabase.getDatabase(context)
    private val repository = Repository(database.dietDao())

    override fun setInitialState(): WeightTrackerState {
        return WeightTrackerState()
    }

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getAllWeights().collectLatest {
                setState {
                    copy(
                        weightList = it.sortedBy { it.timeMillis }?.map {
                            WeightEntry(it.timeMillis.getDay(), it.weight.toFloat())
                        }.orEmpty(),
                        showChart = it.isEmpty().not(),
                        weightListTemp = it,
                        firstWeight = it.minByOrNull { it.timeMillis }?.weight.toString(),
                        lastWeight = it.maxByOrNull { it.timeMillis }?.weight.toString()
                    )
                }
            }
        }
    }

    override fun handleEvents(event: WeightTrackerEvent) {
        when (event) {
            WeightTrackerEvent.OnBackClicked -> {
                setEffect { WeightTrackerEffect.NavigateBack }
            }

            is WeightTrackerEvent.OnTimePeriodChanged -> {
                setState { copy(timePeriod = event.timePeriod) }
                setState {
                    copy(
                        weightList = getCurrentState().weightListTemp.sortedBy { it.timeMillis }.filter {
                            when (event.timePeriod) {
                                TimePeriod.WEEK -> it.timeMillis > System.currentTimeMillis() - 604800000
                                TimePeriod.MONTH -> it.timeMillis > System.currentTimeMillis() - 2629746000
                                TimePeriod.THREE_MONTHS -> it.timeMillis > System.currentTimeMillis() - 7889238000
                                TimePeriod.YEAR -> it.timeMillis > System.currentTimeMillis() - 31556952000
                            }
                        }.map {
                            WeightEntry(it.timeMillis.getDay(), it.weight.toFloat())
                        }
                    )
                }
            }

            is WeightTrackerEvent.OnWeightChanged -> {
                setState { copy(weight = event.weight) }
            }

            WeightTrackerEvent.OnSaveClicked -> {
                setState { copy(isShowDatePicker = true) }
            }

            WeightTrackerEvent.OnDateDialogDismissed -> {
                setState { copy(isShowDatePicker = false) }
            }

            is WeightTrackerEvent.OnDateSelected -> {
                viewModelScope.launch(Dispatchers.IO) {
                    repository.insertWeight(
                        weight = getCurrentState().weight?.toIntOrNull() ?: 0,
                        timeMillis = event.selectedDateMillis ?: System.currentTimeMillis()
                    )
                }
                setState { copy(isShowDatePicker = false) }
            }
        }
    }
}

sealed interface WeightTrackerEvent : Event {
    data object OnBackClicked : WeightTrackerEvent
    data object OnSaveClicked : WeightTrackerEvent
    data object OnDateDialogDismissed : WeightTrackerEvent

    data class OnTimePeriodChanged(val timePeriod: TimePeriod) : WeightTrackerEvent
    data class OnWeightChanged(val weight: String) : WeightTrackerEvent
    data class OnDateSelected(val selectedDateMillis: Long?) : WeightTrackerEvent
}

data class WeightTrackerState(
    val isLoading: Boolean = false,
    val firstWeight: String = "",
    val lastWeight: String = "",
    val timePeriod: TimePeriod = TimePeriod.YEAR,
    val weight: String? = "",
    val isShowDatePicker: Boolean = false,
    val weightList: List<WeightEntry> = emptyList(),
    val weightListTemp: List<WeightTracker> = emptyList(),
    val showChart: Boolean = false,
) : State {

}

sealed interface WeightTrackerEffect : Effect {
    data object NavigateBack : WeightTrackerEffect
}

enum class TimePeriod {
    WEEK,
    MONTH,
    THREE_MONTHS,
    YEAR
}
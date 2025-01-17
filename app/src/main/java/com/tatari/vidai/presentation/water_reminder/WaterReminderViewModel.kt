package com.tatari.vidai.presentation.water_reminder

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WaterReminderViewModel @Inject constructor() :
    BaseViewModel<WaterReminderEvent, WaterReminderState, WaterReminderEffect>() {
    override fun setInitialState(): WaterReminderState {
        return WaterReminderState()
    }

    override fun handleEvents(event: WaterReminderEvent) {
        when (event) {
            WaterReminderEvent.OnBackClicked -> {
                setEffect { WaterReminderEffect.NavigateBack }
            }
        }
    }
}

sealed interface WaterReminderEvent : Event {
    data object OnBackClicked : WaterReminderEvent
}

data class WaterReminderState(
    val isLoading: Boolean = false
) : State

sealed interface WaterReminderEffect : Effect {
    data object NavigateBack : WaterReminderEffect
}
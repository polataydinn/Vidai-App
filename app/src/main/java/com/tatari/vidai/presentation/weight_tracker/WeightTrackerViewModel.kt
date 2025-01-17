package com.tatari.vidai.presentation.weight_tracker

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeightTrackerViewModel @Inject constructor() :
    BaseViewModel<WeightTrackerEvent, WeightTrackerState, WeightTrackerEffect>() {
    override fun setInitialState(): WeightTrackerState {
        return WeightTrackerState()
    }

    override fun handleEvents(event: WeightTrackerEvent) {
        when (event) {
            WeightTrackerEvent.OnBackClicked -> {
                setEffect { WeightTrackerEffect.NavigateBack }
            }
        }
    }
}

sealed interface WeightTrackerEvent : Event {
    data object OnBackClicked : WeightTrackerEvent
}

data class WeightTrackerState(
    val isLoading: Boolean = false
) : State

sealed interface WeightTrackerEffect : Effect {
    data object NavigateBack : WeightTrackerEffect
}
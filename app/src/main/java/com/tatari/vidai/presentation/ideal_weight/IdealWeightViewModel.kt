package com.tatari.vidai.presentation.ideal_weight

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IdealWeightViewModel @Inject constructor() :
    BaseViewModel<IdealWeightEvent, IdealWeightState, IdealWeightEffect>() {
    override fun setInitialState(): IdealWeightState {
        return IdealWeightState()
    }

    override fun handleEvents(event: IdealWeightEvent) {
        when (event) {
            IdealWeightEvent.OnBackClicked -> {
                setEffect { IdealWeightEffect.NavigateBack }
            }
        }
    }
}

sealed interface IdealWeightEvent : Event {
    data object OnBackClicked : IdealWeightEvent
}

data class IdealWeightState(
    val isLoading: Boolean = false
) : State

sealed interface IdealWeightEffect : Effect {
    data object NavigateBack : IdealWeightEffect
}
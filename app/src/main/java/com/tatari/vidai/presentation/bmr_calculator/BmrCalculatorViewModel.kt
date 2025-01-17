package com.tatari.vidai.presentation.bmr_calculator

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BmrCalculatorViewModel @Inject constructor() :
    BaseViewModel<BmrCalculatorEvent, BmrCalculatorState, BmrCalculatorEffect>() {
    override fun setInitialState(): BmrCalculatorState {
        return BmrCalculatorState()
    }

    override fun handleEvents(event: BmrCalculatorEvent) {
        when (event) {
            BmrCalculatorEvent.OnBackClicked -> {
                setEffect { BmrCalculatorEffect.NavigateBack }
            }
        }
    }
}

sealed interface BmrCalculatorEvent : Event {
    data object OnBackClicked : BmrCalculatorEvent
}

data class BmrCalculatorState(
    val isLoading: Boolean = false
) : State

sealed interface BmrCalculatorEffect : Effect {
    data object NavigateBack : BmrCalculatorEffect
}
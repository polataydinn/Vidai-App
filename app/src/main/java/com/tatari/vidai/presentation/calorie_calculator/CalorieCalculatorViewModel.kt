package com.tatari.vidai.presentation.calorie_calculator

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CalorieCalculatorViewModel @Inject constructor() :
    BaseViewModel<CalorieCalculatorEvent, CalorieCalculatorState, CalorieCalculatorEffect>() {
    override fun setInitialState(): CalorieCalculatorState {
        return CalorieCalculatorState()
    }

    override fun handleEvents(event: CalorieCalculatorEvent) {
        when (event) {
            CalorieCalculatorEvent.OnBackClicked -> {
                setEffect { CalorieCalculatorEffect.NavigateBack }
            }
        }
    }
}

sealed interface CalorieCalculatorEvent : Event {
    data object OnBackClicked : CalorieCalculatorEvent
}

data class CalorieCalculatorState(
    val isLoading: Boolean = false
) : State

sealed interface CalorieCalculatorEffect : Effect {
    data object NavigateBack : CalorieCalculatorEffect
}
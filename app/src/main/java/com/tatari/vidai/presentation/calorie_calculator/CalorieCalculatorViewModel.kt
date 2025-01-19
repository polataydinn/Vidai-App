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

            is CalorieCalculatorEvent.OnBmrValueChanged -> {
                setState { copy(bmrValue = event.bmrValue) }
            }

            CalorieCalculatorEvent.OnCalculateClicked -> {
                val bmrValue = getCurrentState().bmrValue?.toIntOrNull() ?: 0
                val calculatedValue = (bmrValue * 1.2).toString()
                setState { copy(calculatedValue = calculatedValue, showCalorieCard = true) }
            }
        }
    }
}

sealed interface CalorieCalculatorEvent : Event {
    data object OnBackClicked : CalorieCalculatorEvent
    data object OnCalculateClicked : CalorieCalculatorEvent
    data class OnBmrValueChanged(val bmrValue: String?) : CalorieCalculatorEvent
}

data class CalorieCalculatorState(
    val isLoading: Boolean = false,
    val bmrValue: String? = "",
    val showCalorieCard: Boolean = false,
    val calculatedValue: String? = ""
) : State

sealed interface CalorieCalculatorEffect : Effect {
    data object NavigateBack : CalorieCalculatorEffect
}
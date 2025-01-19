package com.tatari.vidai.presentation.bmr_calculator

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import com.tatari.vidai.presentation.ideal_weight.Gender
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

            BmrCalculatorEvent.OnCalculateClicked -> {
                val height = getCurrentState().height?.toIntOrNull() ?: 0
                val age = getCurrentState().age?.toIntOrNull() ?: 0
                val weight = getCurrentState().weight?.toIntOrNull() ?: 0
                val bmrCalculated = when (getCurrentState().selectedGender) {
                    Gender.WOMAN -> {
                        (655.1 + (9.56 * weight) + (1.85 * height) - (4.68 * age)).toString()
                    }

                    Gender.MAN -> {
                        (66.47 + (13.75 * weight) + (5 * height) - (6.76 * age)).toString()
                    }
                }

                setState { copy(calculatedValue = bmrCalculated, showBmrCard = true) }
            }

            is BmrCalculatorEvent.OnGenderChanged -> {
                setState { copy(selectedGender = event.gender) }
            }

            is BmrCalculatorEvent.OnHeightChanged -> {
                setState { copy(height = event.height) }
            }

            is BmrCalculatorEvent.OnAgeChanged -> {
                setState { copy(age = event.age) }
            }

            is BmrCalculatorEvent.OnWeightChanged -> {
                setState { copy(weight = event.weight) }
            }
        }
    }
}

sealed interface BmrCalculatorEvent : Event {
    data object OnBackClicked : BmrCalculatorEvent
    data object OnCalculateClicked : BmrCalculatorEvent
    data class OnGenderChanged(val gender: Gender) : BmrCalculatorEvent
    data class OnHeightChanged(val height: String) : BmrCalculatorEvent
    data class OnWeightChanged(val weight: String) : BmrCalculatorEvent
    data class OnAgeChanged(val age: String) : BmrCalculatorEvent
}

data class BmrCalculatorState(
    val isLoading: Boolean = false,
    val selectedGender: Gender = Gender.WOMAN,
    val height: String? = "",
    val weight: String? = "",
    val age: String? = "",
    val showBmrCard: Boolean = false,
    val calculatedValue: String? = ""
) : State

sealed interface BmrCalculatorEffect : Effect {
    data object NavigateBack : BmrCalculatorEffect
}
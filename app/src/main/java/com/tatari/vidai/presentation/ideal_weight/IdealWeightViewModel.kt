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

            is IdealWeightEvent.OnGenderChanged -> {
                setState { copy(selectedGender = event.gender) }
            }

            is IdealWeightEvent.OnHeightChanged -> {
                setState { copy(height = event.height) }
            }

            IdealWeightEvent.OnCalculateClicked -> {
                val height = getCurrentState().height?.toIntOrNull() ?: 0
                val idealWeight  = when (getCurrentState().selectedGender) {
                    Gender.WOMAN -> (height - 100 - (height - 150) / 2.5).toString()
                    Gender.MAN -> (height - 100 - (height - 150) / 4).toString()
                }
                setState { copy(showIdealWeightCard = true, calculatedValue = idealWeight) }
            }
        }
    }
}

sealed interface IdealWeightEvent : Event {
    data object OnBackClicked : IdealWeightEvent
    data object OnCalculateClicked : IdealWeightEvent
    data class OnGenderChanged(val gender: Gender) : IdealWeightEvent
    data class OnHeightChanged(val height: String) : IdealWeightEvent
}

data class IdealWeightState(
    val isLoading: Boolean = false,
    val selectedGender: Gender = Gender.WOMAN,
    val height: String? = "",
    val showIdealWeightCard: Boolean = false,
    val calculatedValue: String? = ""
) : State

sealed interface IdealWeightEffect : Effect {
    data object NavigateBack : IdealWeightEffect
}

enum class Gender {
    WOMAN, MAN
}
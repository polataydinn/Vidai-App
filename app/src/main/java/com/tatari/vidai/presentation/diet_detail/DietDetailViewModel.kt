package com.tatari.vidai.presentation.diet_detail

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DietDetailViewModel @Inject constructor() :
    BaseViewModel<DietDetailEvent, DietDetailState, DietDetailEffect>() {
    override fun setInitialState(): DietDetailState {
        return DietDetailState()
    }

    override fun handleEvents(event: DietDetailEvent) {
        when (event) {
            DietDetailEvent.OnBackClicked -> {
                setEffect { DietDetailEffect.NavigateBack }
            }
        }
    }
}

sealed interface DietDetailEvent : Event {
    data object OnBackClicked : DietDetailEvent
}

data class DietDetailState(
    val isLoading: Boolean = false
) : State

sealed interface DietDetailEffect : Effect {
    data object NavigateBack : DietDetailEffect
}
package com.tatari.vidai.presentation.create_password

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreatePasswordViewModel @Inject constructor() :
    BaseViewModel<CreatePasswordEvent, CreatePasswordState, CreatePasswordEffect>() {
    override fun setInitialState(): CreatePasswordState {
        return CreatePasswordState()
    }

    override fun handleEvents(event: CreatePasswordEvent) {
        when (event) {
            CreatePasswordEvent.OnBackClicked -> {
                setEffect { CreatePasswordEffect.NavigateBack }
            }
        }
    }
}

sealed interface CreatePasswordEvent : Event {
    data object OnBackClicked : CreatePasswordEvent
}

data class CreatePasswordState(
    val isLoading: Boolean = false
) : State

sealed interface CreatePasswordEffect : Effect {
    data object NavigateBack : CreatePasswordEffect
}
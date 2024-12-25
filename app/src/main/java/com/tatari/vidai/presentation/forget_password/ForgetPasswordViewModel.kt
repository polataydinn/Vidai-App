package com.tatari.vidai.presentation.forget_password

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ForgetPasswordViewModel @Inject constructor() :
    BaseViewModel<ForgetPasswordEvent, ForgetPasswordState, ForgetPasswordEffect>() {
    override fun setInitialState(): ForgetPasswordState {
        return ForgetPasswordState()
    }

    override fun handleEvents(event: ForgetPasswordEvent) {
        when (event) {
            ForgetPasswordEvent.OnBackClicked -> {
                setEffect { ForgetPasswordEffect.NavigateBack }
            }
        }
    }
}

sealed interface ForgetPasswordEvent : Event {
    data object OnBackClicked : ForgetPasswordEvent
}

data class ForgetPasswordState(
    val isLoading: Boolean = false
) : State

sealed interface ForgetPasswordEffect : Effect {
    data object NavigateBack : ForgetPasswordEffect
}
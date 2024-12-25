package com.tatari.vidai.presentation.forget_password

import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
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

            is ForgetPasswordEvent.OnEmailChange -> {
                setState {
                    copy(
                        email = event.email
                    )
                }
            }

            ForgetPasswordEvent.OnContinueClicked -> {
                resetPassword()
            }
        }
    }

    private fun resetPassword() {
        Firebase.auth.sendPasswordResetEmail(state.value.email)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    setEffect { ForgetPasswordEffect.ContinueClicked }
                } else {
                    setEffect { ForgetPasswordEffect.OnError(task.exception?.message.orEmpty()) }
                }
            }
    }
}

sealed interface ForgetPasswordEvent : Event {
    data object OnBackClicked : ForgetPasswordEvent
    data object OnContinueClicked : ForgetPasswordEvent

    data class OnEmailChange(val email: String) : ForgetPasswordEvent
}

data class ForgetPasswordState(
    val isLoading: Boolean = false,
    val email: String = "",
) : State

sealed interface ForgetPasswordEffect : Effect {
    data object NavigateBack : ForgetPasswordEffect
    data object ContinueClicked : ForgetPasswordEffect
    data class OnError(val message: String) : ForgetPasswordEffect
}
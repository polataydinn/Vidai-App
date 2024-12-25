package com.tatari.vidai.presentation.login

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import com.tatari.vidai.presentation.create_account.CreateAccountEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : BaseViewModel<LoginEvent, LoginState, LoginEffect>() {
    override fun setInitialState(): LoginState {
        return LoginState()
    }

    override fun handleEvents(event: LoginEvent) {
        when (event) {
            LoginEvent.OnBackClicked -> {
                setEffect { LoginEffect.NavigateBack }
            }

            LoginEvent.PasswordVisibilityChanged -> {
                setState {
                    copy(passwordVisibility = !passwordVisibility)
                }
            }

            LoginEvent.RememberMeChanged -> {
                setState {
                    copy(isRememberMe = !isRememberMe)
                }
            }

            is LoginEvent.Login -> {
                setState {
                    copy(isError = false)
                }
            }

            is LoginEvent.EmailChanged -> {
                setState {
                    copy(email = event.email)
                }
            }

            is LoginEvent.PasswordChanged -> {
                setState {
                    copy(password = event.password)
                }
            }

            LoginEvent.OnForgetPasswordClicked -> setEffect { LoginEffect.NavigateToForgetPassword }
            LoginEvent.OnSignInClicked -> {

            }

            LoginEvent.OnCreateAccountClicked -> {
                setEffect { LoginEffect.NavigateToCreateAccount }
            }
        }
    }
}

sealed interface LoginEvent : Event {
    data class EmailChanged(val email: String) : LoginEvent
    data class Login(val email: String, val password: String) : LoginEvent
    data class PasswordChanged(val password: String) : LoginEvent
    data object PasswordVisibilityChanged : LoginEvent
    data object RememberMeChanged : LoginEvent
    data object OnForgetPasswordClicked : LoginEvent
    data object OnBackClicked : LoginEvent
    data object OnSignInClicked : LoginEvent
    data object OnCreateAccountClicked : LoginEvent
}

data class LoginState(
    val isLoading: Boolean = false,
    val email: String = "",
    val password: String = "",
    val isError: Boolean = false,
    val passwordVisibility: Boolean = true,
    val isRememberMe: Boolean = true,
) : State

sealed interface LoginEffect : Effect {
    data object NavigateBack : LoginEffect
    data object NavigateToForgetPassword : LoginEffect
    data object NavigateToCreateAccount : LoginEffect
}
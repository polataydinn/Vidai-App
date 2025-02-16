package com.tatari.vidai.presentation.login

import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.tatari.vidai.common.Session
import com.tatari.vidai.common.User
import com.tatari.vidai.data.repository.getUser
import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import com.tatari.vidai.presentation.create_password.USERS_REF
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
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
                login()
            }

            LoginEvent.OnCreateAccountClicked -> {
                setEffect { LoginEffect.NavigateToCreateAccount }
            }
        }
    }

    private fun login() {
         Firebase.auth.signInWithEmailAndPassword(getCurrentState().email, getCurrentState().password)
             .addOnCompleteListener { task ->
                 if (task.isSuccessful) {
                     viewModelScope.launch {
                         Session.createAccount = getUser()
                     }
                     setEffect { LoginEffect.NavigateToHome }
                 } else {
                     setEffect { LoginEffect.ShowError(task.exception?.message.orEmpty()) }
                     setState { copy(isError = true) }
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
) : State {
    val isLoginEnabled: Boolean
        get() = email.isNotEmpty() && password.isNotEmpty()
}

sealed interface LoginEffect : Effect {
    data object NavigateBack : LoginEffect
    data object NavigateToForgetPassword : LoginEffect
    data object NavigateToCreateAccount : LoginEffect
    data object NavigateToHome : LoginEffect
    data class ShowError(val message: String) : LoginEffect
}
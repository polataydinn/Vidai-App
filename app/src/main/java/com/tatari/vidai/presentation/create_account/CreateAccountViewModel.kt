package com.tatari.vidai.presentation.create_account

import com.tatari.vidai.common.Session
import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreateAccountViewModel @Inject constructor() :
    BaseViewModel<CreateAccountEvent, CreateAccountState, CreateAccountEffect>() {
    override fun setInitialState(): CreateAccountState {
        return CreateAccountState()
    }

    override fun handleEvents(event: CreateAccountEvent) {
        when (event) {
            CreateAccountEvent.OnBackClicked -> {
                setEffect { CreateAccountEffect.NavigateBack }
            }

            is CreateAccountEvent.OnEmailChanged -> {
                setState {
                    copy(email = event.email, isEmailChanged = true)
                }
            }
            is CreateAccountEvent.OnNameChanged -> {
                setState {
                    copy(name = event.name, isNameChanged = true)
                }
            }
            is CreateAccountEvent.OnSurnameChanged -> {
                setState {
                    copy(surname = event.surname, isSurnameChanged = true)
                }
            }

            CreateAccountEvent.OnContinueClicked -> {
                if (getCurrentState().isContinueEnabled) {
                    Session.createAccount = Session.createAccount?.copy(
                        name = getCurrentState().name.orEmpty(),
                        surname = getCurrentState().surname.orEmpty(),
                        email = getCurrentState().email.orEmpty()
                    )
                    setEffect { CreateAccountEffect.NavigateToCreatePassword }
                } else {
                    setState { copy(isGeneralError = true)}
                }
            }

            CreateAccountEvent.OnGeneralErrorShown -> {
                setState { copy(isGeneralError = false) }
            }
        }
    }
}

sealed interface CreateAccountEvent : Event {
    data class OnNameChanged(val name: String): CreateAccountEvent
    data class OnSurnameChanged(val surname: String): CreateAccountEvent
    data class OnEmailChanged(val email: String): CreateAccountEvent
    data object OnBackClicked : CreateAccountEvent
    data object OnContinueClicked : CreateAccountEvent
    data object OnGeneralErrorShown : CreateAccountEvent
}

data class CreateAccountState(
    val isLoading: Boolean = false,
    val name: String? = "",
    val surname: String? = "",
    val email: String? = "",
    val isNameChanged : Boolean = false,
    val isSurnameChanged : Boolean = false,
    val isEmailChanged : Boolean = false,
    val isGeneralError: Boolean = false
) : State {
    val isNameError: Boolean = name.isNullOrBlank() && isNameChanged
    val isSurNameError: Boolean = surname.isNullOrBlank() && isSurnameChanged
    val isEmailError: Boolean = email.isNullOrBlank() && isEmailChanged
    val isContinueEnabled: Boolean =
        name.isNullOrBlank().not() && surname.isNullOrBlank().not() && email.isNullOrBlank().not()
}

sealed interface CreateAccountEffect : Effect {
    data object NavigateBack : CreateAccountEffect
    data object NavigateToCreatePassword : CreateAccountEffect
}
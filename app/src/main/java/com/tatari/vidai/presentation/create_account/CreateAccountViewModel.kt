package com.tatari.vidai.presentation.create_account

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
                    copy(email = event.email)
                }
            }
            is CreateAccountEvent.OnNameChanged -> {
                setState {
                    copy(name = event.name)
                }
            }
            is CreateAccountEvent.OnSurnameChanged -> {
                setState {
                    copy(surname = event.surname)
                }
            }
        }
    }
}

sealed interface CreateAccountEvent : Event {
    data class OnNameChanged(val name: String): CreateAccountEvent
    data class OnSurnameChanged(val surname: String): CreateAccountEvent
    data class OnEmailChanged(val email: String): CreateAccountEvent
    data object OnBackClicked : CreateAccountEvent
}

data class CreateAccountState(
    val isLoading: Boolean = false,
    val name: String? = "",
    val surname: String? = "",
    val email: String? = "",
) : State {
    val isNameError: Boolean = name.isNullOrBlank()
    val isSurNameError: Boolean = surname.isNullOrBlank()
    val isEmailError: Boolean = email.isNullOrBlank()
}

sealed interface CreateAccountEffect : Effect {
    data object NavigateBack : CreateAccountEffect
}
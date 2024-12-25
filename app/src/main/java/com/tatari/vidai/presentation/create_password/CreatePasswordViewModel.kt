package com.tatari.vidai.presentation.create_password

import com.google.firebase.auth.auth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.tatari.vidai.common.Session
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

            is CreatePasswordEvent.FirstPasswordChanged -> {
                setState {
                    copy(firstPassword = event.password,
                        passwordConstraints = passwordConstraints.map { constraint ->
                            constraint.copy(isValid = constraint.id.predicate(event.password))
                        },
                        secondPasswordMatch = secondPassword == event.password)
                }
            }

            CreatePasswordEvent.PasswordVisibilityChanged -> {
                setState {
                    copy(passwordVisibility = !passwordVisibility, )
                }
            }

            is CreatePasswordEvent.SecondPasswordChanged -> {
                setState {
                    copy(secondPassword = event.password, secondPasswordMatch = firstPassword == event.password)
                }
            }

            CreatePasswordEvent.OnCreateAccount -> {
                createUser()
            }
            CreatePasswordEvent.OnLoginClicked -> {

            }
        }
    }

    private fun createUser() {
        Firebase.auth.createUserWithEmailAndPassword(Session.createAccount?.email.orEmpty(), getCurrentState().firstPassword)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    setEffect { CreatePasswordEffect.NavigateToHome }
                } else {
                    setEffect { CreatePasswordEffect.OnError(task.exception?.message.orEmpty()) }
                }
            }

    }
}

sealed interface CreatePasswordEvent : Event {
    data object OnBackClicked : CreatePasswordEvent
    data object OnLoginClicked : CreatePasswordEvent
    data object OnCreateAccount : CreatePasswordEvent
    data class FirstPasswordChanged(val password: String) : CreatePasswordEvent
    data class SecondPasswordChanged(val password: String) : CreatePasswordEvent
    data object PasswordVisibilityChanged : CreatePasswordEvent
}

data class CreatePasswordState(
    val isLoading: Boolean = false,
    val passwordVisibility: Boolean = false,
    val firstPassword: String = "",
    val secondPassword: String = "",
    val passwordConstraints: List<PasswordConstraint> = listOf(
        PasswordConstraint(
            PasswordConstraintType.LENGTH, "Şifre en az 8 karakter uzunluğunda olmalıdır.", false
        ),
        PasswordConstraint(
            PasswordConstraintType.UPPER_CASE, "Şifre en az bir büyük harf içermelidir.", false
        ),
        PasswordConstraint(PasswordConstraintType.LOWER_CASE, "Bir küçük harf.", false),
        PasswordConstraint(
            PasswordConstraintType.NUMBER_SPECIAL_CHARACTER,
            "Şifre en az bir rakam veya özel karakter içermelidir.",
            false
        ),
    ),
    val secondPasswordMatch:Boolean = firstPassword == secondPassword,
) : State {
    val isButtonEnabled: Boolean
        get() = passwordConstraints.all { it.isValid } && secondPasswordMatch
}

sealed interface CreatePasswordEffect : Effect {
    data object NavigateBack : CreatePasswordEffect
    data object NavigateToHome : CreatePasswordEffect
    data class OnError(val errorMessage: String) : CreatePasswordEffect
}

data class PasswordConstraint(
    val id: PasswordConstraintType,
    val text: String,
    val isValid: Boolean,
)

enum class PasswordConstraintType(val predicate: (String) -> Boolean) {
    LENGTH({ it.length >= 8 }),
    UPPER_CASE({ it.contains(Regex("[A-Z]")) }),
    LOWER_CASE({
        it.contains(
            Regex("[a-z]")
        )
    }),
    NUMBER_SPECIAL_CHARACTER({ it.contains(Regex("[0-9]")) || it.contains(Regex("[^A-Za-z0-9]")) }),
    MATCH_WITH_FIRST({ true })
}

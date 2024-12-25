package com.tatari.vidai.presentation.verify_otp

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class VerifyOtpViewModel @Inject constructor() :
    BaseViewModel<VerifyOtpEvent, VerifyOtpState, VerifyOtpEffect>() {
    override fun setInitialState(): VerifyOtpState {
        return VerifyOtpState()
    }

    override fun handleEvents(event: VerifyOtpEvent) {
        when (event) {
            VerifyOtpEvent.OnBackClicked -> {
                setEffect { VerifyOtpEffect.NavigateBack }
            }
        }
    }
}

sealed interface VerifyOtpEvent : Event {
    data object OnBackClicked : VerifyOtpEvent
}

data class VerifyOtpState(
    val isLoading: Boolean = false
) : State

sealed interface VerifyOtpEffect : Effect {
    data object NavigateBack : VerifyOtpEffect
}
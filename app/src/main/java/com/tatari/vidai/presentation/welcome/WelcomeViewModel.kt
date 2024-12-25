package com.tatari.vidai.presentation.welcome

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel @Inject constructor(): BaseViewModel<WelcomeEvent, WelcomeState, WelcomeEffect>() {
    override fun setInitialState(): WelcomeState {
        return WelcomeState()
    }

    override fun handleEvents(event: WelcomeEvent) {
        when (event) {
            WelcomeEvent.OnGoogleClicked -> {
                setEffect { WelcomeEffect.NavigateToHome }
            }

            WelcomeEvent.OnSignInClicked -> {
                setEffect { WelcomeEffect.NavigateToSignIn }
            }
        }
    }

}

sealed interface WelcomeEvent: Event {
    data object OnGoogleClicked: WelcomeEvent
    data object OnSignInClicked: WelcomeEvent
}

data class WelcomeState(
    val isLoading: Boolean = false
): State

sealed interface WelcomeEffect: Effect {
    data object NavigateToHome: WelcomeEffect
    data object NavigateToSignIn: WelcomeEffect
}
package com.tatari.vidai.presentation.profile

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor() :
    BaseViewModel<ProfileEvent, ProfileState, ProfileEffect>() {
    override fun setInitialState(): ProfileState {
        return ProfileState()
    }

    override fun handleEvents(event: ProfileEvent) {
        when (event) {
            ProfileEvent.OnBackClicked -> {
                setEffect { ProfileEffect.NavigateBack }
            }
        }
    }
}

sealed interface ProfileEvent : Event {
    data object OnBackClicked : ProfileEvent
}

data class ProfileState(
    val isLoading: Boolean = false
) : State

sealed interface ProfileEffect : Effect {
    data object NavigateBack : ProfileEffect
}
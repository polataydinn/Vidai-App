package com.tatari.vidai.presentation.home

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel<HomeEvent, HomeState, HomeEffect>() {
    override fun setInitialState(): HomeState {
        return HomeState()
    }

    override fun handleEvents(event: HomeEvent) {
        when (event) {
            HomeEvent.OnLogOutClicked -> {
                FirebaseAuth.getInstance().signOut();
                Firebase.auth.signOut()
                setEffect { HomeEffect.NavigateToLogin }
            }
        }
    }

    //read file from json file which is in raw folder

}

sealed interface HomeEvent : Event {
    data object OnLogOutClicked : HomeEvent

}

data class HomeState(
    val isLoading: Boolean = false,
) : State

sealed interface HomeEffect : Effect {
    data object NavigateToLogin : HomeEffect

}
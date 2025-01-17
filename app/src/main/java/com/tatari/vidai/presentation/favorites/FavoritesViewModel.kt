package com.tatari.vidai.presentation.favorites

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FavoritesViewModel @Inject constructor() :
    BaseViewModel<FavoritesEvent, FavoritesState, FavoritesEffect>() {
    override fun setInitialState(): FavoritesState {
        return FavoritesState()
    }

    override fun handleEvents(event: FavoritesEvent) {
        when (event) {
            FavoritesEvent.OnBackClicked -> {
                setEffect { FavoritesEffect.NavigateBack }
            }
        }
    }
}

sealed interface FavoritesEvent : Event {
    data object OnBackClicked : FavoritesEvent
}

data class FavoritesState(
    val isLoading: Boolean = false
) : State

sealed interface FavoritesEffect : Effect {
    data object NavigateBack : FavoritesEffect
}
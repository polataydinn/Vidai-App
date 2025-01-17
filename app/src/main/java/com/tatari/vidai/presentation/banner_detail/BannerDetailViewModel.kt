package com.tatari.vidai.presentation.banner_detail

import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BannerDetailViewModel @Inject constructor() :
    BaseViewModel<BannerDetailEvent, BannerDetailState, BannerDetailEffect>() {
    override fun setInitialState(): BannerDetailState {
        return BannerDetailState()
    }

    override fun handleEvents(event: BannerDetailEvent) {
        when (event) {
            BannerDetailEvent.OnBackClicked -> {
                setEffect { BannerDetailEffect.NavigateBack }
            }
        }
    }
}

sealed interface BannerDetailEvent : Event {
    data object OnBackClicked : BannerDetailEvent
}

data class BannerDetailState(
    val isLoading: Boolean = false
) : State

sealed interface BannerDetailEffect : Effect {
    data object NavigateBack : BannerDetailEffect
}
package com.tatari.vidai.presentation.home

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.tatari.vidai.common.Session
import com.tatari.vidai.data.model.Diets
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

            is HomeEvent.OnQuickActionsClicked -> {
                when (event.type) {
                    QuickEvents.WATER_REMINDER -> setEffect { HomeEffect.NavigateToWaterReminder }
                    QuickEvents.CALORIE_GOAL -> setEffect { HomeEffect.NavigateToCalorieCalculator }
                    QuickEvents.IDEAL_WEIGHT -> setEffect { HomeEffect.NavigateToIdealWeight }
                    QuickEvents.BMR_CALCULATOR -> setEffect { HomeEffect.NavigateToBMRCalculator }
                    QuickEvents.WEIGHT_TRACKER -> setEffect { HomeEffect.NavigateToWeightTracker }
                    QuickEvents.FAVORITES -> setEffect { HomeEffect.NavigateToFavorites }
                }
            }
        }
    }

    init {
        setState {
            copy(
                dietList = Session.diets
            )
        }
    }
}

sealed interface HomeEvent : Event {
    data object OnLogOutClicked : HomeEvent
    data class OnQuickActionsClicked(val type: QuickEvents) : HomeEvent
}

data class HomeState(
    val isLoading: Boolean = false,
    val dietList: Diets? = null
) : State

sealed interface HomeEffect : Effect {
    data object NavigateToLogin : HomeEffect
    data object NavigateToWaterReminder : HomeEffect
    data object NavigateToCalorieCalculator : HomeEffect
    data object NavigateToIdealWeight : HomeEffect
    data object NavigateToBMRCalculator : HomeEffect
    data object NavigateToWeightTracker : HomeEffect
    data object NavigateToFavorites : HomeEffect


}
package com.tatari.vidai.presentation.home

import android.content.Context
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.tatari.vidai.common.Session
import com.tatari.vidai.common.User
import com.tatari.vidai.data.model.DietsItem
import com.tatari.vidai.data.repository.Repository
import com.tatari.vidai.data.room.DietDatabase
import com.tatari.vidai.presentation.base.BaseViewModel
import com.tatari.vidai.presentation.base.Effect
import com.tatari.vidai.presentation.base.Event
import com.tatari.vidai.presentation.base.State
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    @ApplicationContext private val context: Context
) : BaseViewModel<HomeEvent, HomeState, HomeEffect>() {

    private val database = DietDatabase.getDatabase(context)
    private val repository = Repository(database.dietDao())

    override fun setInitialState(): HomeState {
        viewModelScope.launch {
            val user = Session.authUser()
            setState {
                copy(user = user, isLoading = false)
            }
        }
        return HomeState(isLoading = true)
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

            is HomeEvent.OnDietItemClicked -> {
                Session.selectedDiet = event.diet
                setEffect { HomeEffect.NavigateToDietDetails }
            }

            HomeEvent.OnBannerClicked -> {
                setEffect { HomeEffect.NavigateToBanner }
            }
        }
    }

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getDiets().collectLatest {
                if (getCurrentState().dietList.isNullOrEmpty()) {
                    setState {
                        copy(
                            dietList = it
                        )
                    }
                }
            }
        }
    }
}

sealed interface HomeEvent : Event {
    data object OnLogOutClicked : HomeEvent
    data object OnBannerClicked : HomeEvent

    data class OnQuickActionsClicked(val type: QuickEvents) : HomeEvent
    data class OnDietItemClicked(val diet: DietsItem?) : HomeEvent
}

data class HomeState(
    val user: User? = null,
    val isLoading: Boolean = false,
    val dietList: List<DietsItem>? = null,
) : State

sealed interface HomeEffect : Effect {
    data object NavigateToLogin : HomeEffect
    data object NavigateToWaterReminder : HomeEffect
    data object NavigateToCalorieCalculator : HomeEffect
    data object NavigateToIdealWeight : HomeEffect
    data object NavigateToBMRCalculator : HomeEffect
    data object NavigateToWeightTracker : HomeEffect
    data object NavigateToFavorites : HomeEffect
    data object NavigateToDietDetails : HomeEffect
    data object NavigateToBanner : HomeEffect

}
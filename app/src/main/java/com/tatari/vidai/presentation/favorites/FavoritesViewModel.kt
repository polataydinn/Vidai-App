package com.tatari.vidai.presentation.favorites

import android.content.Context
import androidx.lifecycle.viewModelScope
import com.tatari.vidai.common.Session
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
class FavoritesViewModel @Inject constructor(
    @ApplicationContext private val context: Context
) :
    BaseViewModel<FavoritesEvent, FavoritesState, FavoritesEffect>() {

    private val database = DietDatabase.getDatabase(context)
    private val repository = Repository(database.dietDao())

    override fun setInitialState(): FavoritesState {
        return FavoritesState()
    }

    override fun handleEvents(event: FavoritesEvent) {
        when (event) {
            FavoritesEvent.OnBackClicked -> {
                setEffect { FavoritesEffect.NavigateBack }
            }

            is FavoritesEvent.OnDietItemClicked -> {
                Session.selectedDiet = event.dietItem
                setEffect { FavoritesEffect.NavigateToDietDetails }
            }
        }
    }

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getDiets().collectLatest {
                setState {
                    copy(
                        favoriteDiets = it.filter { it.isFavorite }
                    )
                }
            }
        }
    }
}

sealed interface FavoritesEvent : Event {
    data object OnBackClicked : FavoritesEvent
    data class OnDietItemClicked(val dietItem: DietsItem?) : FavoritesEvent
}

data class FavoritesState(
    val isLoading: Boolean = false,
    val favoriteDiets: List<DietsItem> = emptyList()
) : State

sealed interface FavoritesEffect : Effect {
    data object NavigateBack : FavoritesEffect
    data object NavigateToDietDetails : FavoritesEffect
}
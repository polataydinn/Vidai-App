package com.tatari.vidai.presentation.diet_detail

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
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DietDetailViewModel @Inject constructor(
    @ApplicationContext private val context: Context
) :
    BaseViewModel<DietDetailEvent, DietDetailState, DietDetailEffect>() {

    private val database = DietDatabase.getDatabase(context)
    private val repository = Repository(database.dietDao())

    override fun setInitialState(): DietDetailState {
        return DietDetailState()
    }

    override fun handleEvents(event: DietDetailEvent) {
        when (event) {
            DietDetailEvent.OnBackClicked -> {
                setEffect { DietDetailEffect.NavigateBack }
            }

            DietDetailEvent.OnFavoriteClicked -> {
                val diet = state.value.diet ?: return
                val isFavorite = !diet.isFavorite
                viewModelScope.launch(Dispatchers.IO) {
                    repository.updateFavoriteStatus(diet._id, isFavorite)
                }
                setState {
                    copy(
                        diet = diet.copy(isFavorite = isFavorite)
                    )
                }
            }
        }
    }

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getDiets().collectLatest {
                it.find { diet -> diet._id == Session.selectedDiet?._id }?.let { diet ->
                    if (getCurrentState().diet == null) {
                        setState {
                            copy(
                                diet = diet
                            )
                        }
                    }
                }
            }
        }
    }
}

sealed interface DietDetailEvent : Event {
    data object OnBackClicked : DietDetailEvent
    data object OnFavoriteClicked : DietDetailEvent
}

data class DietDetailState(
    val isLoading: Boolean = false,
    val diet: DietsItem? = null
) : State

sealed interface DietDetailEffect : Effect {
    data object NavigateBack : DietDetailEffect
}
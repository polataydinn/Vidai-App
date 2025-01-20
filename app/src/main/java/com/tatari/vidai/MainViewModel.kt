package com.tatari.vidai

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tatari.vidai.data.model.Diets
import com.tatari.vidai.data.repository.Repository
import com.tatari.vidai.data.room.DietDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    @ApplicationContext private val context: Context
): ViewModel() {

    private val database = DietDatabase.getDatabase(context)
    private val repository = Repository(database.dietDao())

    fun insertDiets(diets: Diets) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getDiets().firstOrNull()?.let {
                if (it.isEmpty()) {
                    repository.insertDiets(diets)
                }
            } ?: run {
                repository.insertDiets(diets)
            }
        }
    }
}
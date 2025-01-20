package com.tatari.vidai.data.repository

import com.tatari.vidai.common.getCurrentTime
import com.tatari.vidai.common.toTurkishDate
import com.tatari.vidai.data.model.DietsItem
import com.tatari.vidai.data.room.DietDao
import com.tatari.vidai.data.room.WaterReminder
import com.tatari.vidai.data.room.WeightTracker

class Repository(private val dietDao: DietDao) {

    suspend fun insertWaterReminder(currentIntake: Int) {
        val currentTime = getCurrentTime()
        dietDao.getWaterReminderByTime(currentTime)?.let {
            dietDao.updateWaterReminder(currentTime, currentIntake)
        } ?: dietDao.insertWaterReminder(
            WaterReminder(
                time = currentTime,
                currentIntake = currentIntake
            )
        )

    }

    fun getCurrentWaterReminder() = dietDao.getAllWaterReminder()

    suspend fun insertWeight(weight: Int, timeMillis: Long) {
        dietDao.insertWeight(
            WeightTracker(
                time = timeMillis.toTurkishDate().orEmpty(),
                weight = weight,
                timeMillis = timeMillis
            )
        )
    }

    fun getAllWeights() = dietDao.getAllWeights()

    suspend fun insertDiets(diets: List<DietsItem>) {
        dietDao.insertDiets(diets)
    }

    fun getDiets() = dietDao.getDiet()

    suspend fun updateFavoriteStatus(id: Int, isFavorite: Boolean) {
        dietDao.updateFavoriteStatus(id, isFavorite)
    }

    fun getFavoriteDiets() = dietDao.getFavoriteDiets()
}
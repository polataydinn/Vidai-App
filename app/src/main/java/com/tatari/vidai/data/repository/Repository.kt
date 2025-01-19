package com.tatari.vidai.data.repository

import com.tatari.vidai.common.getCurrentTime
import com.tatari.vidai.data.room.DietDao
import com.tatari.vidai.data.room.WaterReminder

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

}
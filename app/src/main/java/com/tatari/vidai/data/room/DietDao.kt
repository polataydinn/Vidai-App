package com.tatari.vidai.data.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.flow.Flow

@Dao
interface DietDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWaterReminder(waterReminder: WaterReminder)

    @Query("SELECT * FROM water_reminder")
    fun getAllWaterReminder(): Flow<List<WaterReminder>>

    @Query("SELECT * FROM water_reminder WHERE time = :time LIMIT 1")
    fun getWaterReminderByTime(time: String): WaterReminder?

    @Query("UPDATE water_reminder SET currentIntake = :currentIntake WHERE time = :currentTime")
    fun updateWaterReminder(currentTime: String, currentIntake: Int)


}

@Entity(tableName = "water_reminder")
data class WaterReminder(
    @PrimaryKey(autoGenerate = true)
    val _id: Int = 0,
    @SerializedName("time")
    val time: String,
    @SerializedName("currentIntake")
    val currentIntake: Int
)
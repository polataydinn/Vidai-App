package com.tatari.vidai.data.room

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import com.google.gson.annotations.SerializedName
import com.tatari.vidai.data.model.DietsItem
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


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWeight(weightTracker: WeightTracker)

    @Query("SELECT * FROM weight_tracker")
    fun getAllWeights(): Flow<List<WeightTracker>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertDiets(weightTracker: List<DietsItem>)

    @Query("SELECT * FROM diets")
    fun getDiet(): Flow<List<DietsItem>>

    @Query("UPDATE diets SET isFavorite = :isFavorite WHERE _id = :id")
    fun updateFavoriteStatus(id: Int, isFavorite: Boolean)

    @Query("SELECT * FROM diets WHERE isFavorite = 1")
    fun getFavoriteDiets(): Flow<List<DietsItem>>

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

@Entity(tableName = "weight_tracker")
data class WeightTracker(
    @PrimaryKey(autoGenerate = true)
    val _id: Int = 0,
    @SerializedName("time")
    val time: String,
    @SerializedName("time")
    val timeMillis: Long,
    @SerializedName("currentIntake")
    val weight: Int
)
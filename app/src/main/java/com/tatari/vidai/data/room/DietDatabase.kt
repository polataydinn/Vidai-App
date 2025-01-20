package com.tatari.vidai.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.tatari.vidai.DietTypeConverter
import com.tatari.vidai.data.model.DietsItem

@Database(entities = [WaterReminder::class, WeightTracker::class, DietsItem::class], version = 4, exportSchema = false)
@TypeConverters(DietTypeConverter::class)
abstract class DietDatabase : RoomDatabase() {

    abstract fun dietDao(): DietDao

    companion object {

        @Volatile
        private var INSTANCE: DietDatabase? = null

        fun getDatabase(context: Context): DietDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) return tempInstance

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DietDatabase::class.java,
                    "diet_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
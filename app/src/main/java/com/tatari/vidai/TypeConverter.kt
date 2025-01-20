package com.tatari.vidai

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.tatari.vidai.data.model.Diet

class DietTypeConverter {
    @TypeConverter
    fun fromSource(dietsItem: List<Diet>?): String {
        return Gson().toJson(dietsItem)
    }

    @TypeConverter
    fun toSource(source: String): List<Diet> {
        val listType = object : TypeToken<List<Diet?>?>() {}.type
        return Gson().fromJson<List<Diet>>(source, listType)
    }
}
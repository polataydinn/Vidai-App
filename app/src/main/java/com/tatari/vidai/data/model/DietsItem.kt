package com.tatari.vidai.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "diets")
data class DietsItem(
    @PrimaryKey(autoGenerate = true)
    val _id: Int = 0,
    @SerializedName("dietList")
    val dietList: List<Diet>,
    @SerializedName("shortDescription")
    val shortDescription: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("isFavorite")
    val isFavorite: Boolean = false
)
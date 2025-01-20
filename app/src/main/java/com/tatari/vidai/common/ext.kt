package com.tatari.vidai.common

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import com.tatari.vidai.MainActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun Context.getActivityOrNull(): MainActivity? {
    var context = this
    while (context is ContextWrapper) {
        if (context is MainActivity) return context
        context = context.baseContext
    }

    return null
}

fun getCurrentTime(): String {
    val currentTime = System.currentTimeMillis()
    val day = android.text.format.DateFormat.format("dd", currentTime) as String
    val month = android.text.format.DateFormat.format("MM", currentTime) as String
    val year = android.text.format.DateFormat.format("yyyy", currentTime) as String
    return "$day-$month-$year"
}

fun getTurkishDate(): String {
    val currentTime = System.currentTimeMillis()
    val date = Date(currentTime)
    val locale = Locale("tr", "TR")
    val sdf = SimpleDateFormat("dd-MMMM", locale)
    return sdf.format(date).replaceFirstChar { it.uppercase() }
}

fun Long?.toTurkishDate() = this?.let {
    val date = Date(it)
    val locale = Locale("tr", "TR")
    val sdf = SimpleDateFormat("dd-MMMM", locale)
    sdf.format(date).replaceFirstChar { it.uppercase() }
}

fun Long?.getDay(): Float {
    val date = Date(this ?: 0)
    val sdf = SimpleDateFormat("dd", Locale.getDefault())
    return sdf.format(date).toFloat()
}

fun Long?.getTurkishShortMonth(): String {
    val date = Date(this ?: 0)
    val locale = Locale("tr", "TR")
    val sdf = SimpleDateFormat("MMM", locale)
    return sdf.format(date).replaceFirstChar { it.uppercase() }
}
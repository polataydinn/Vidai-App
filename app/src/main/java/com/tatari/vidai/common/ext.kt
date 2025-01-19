package com.tatari.vidai.common

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import com.tatari.vidai.MainActivity

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
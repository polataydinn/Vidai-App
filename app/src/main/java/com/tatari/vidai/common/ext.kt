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
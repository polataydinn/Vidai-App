package com.tatari.vidai.presentation.water_reminder

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val WaterReminderRoute = "WaterReminderRoute"

fun NavController.navigateToWaterReminder(navOptions: NavOptions? = null) {
    this.navigate(WaterReminderRoute, navOptions)
}

fun NavGraphBuilder.waterReminderScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = WaterReminderRoute,
    ) {
        WaterReminderRoute(
            navigateBack = navigateBack,
        )
    }
}

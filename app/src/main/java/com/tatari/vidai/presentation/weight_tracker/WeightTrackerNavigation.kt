package com.tatari.vidai.presentation.weight_tracker

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val WeightTrackerRoute = "WeightTrackerRoute"

fun NavController.navigateToWeightTracker(navOptions: NavOptions? = null) {
    this.navigate(WeightTrackerRoute, navOptions)
}

fun NavGraphBuilder.weightTrackerScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = WeightTrackerRoute,
    ) {
        WeightTrackerRoute(
            navigateBack = navigateBack,
        )
    }
}

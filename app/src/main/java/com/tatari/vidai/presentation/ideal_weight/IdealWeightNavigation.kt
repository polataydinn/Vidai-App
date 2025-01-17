package com.tatari.vidai.presentation.ideal_weight

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val IdealWeightRoute = "IdealWeightRoute"

fun NavController.navigateToIdealWeight(navOptions: NavOptions? = null) {
    this.navigate(IdealWeightRoute, navOptions)
}

fun NavGraphBuilder.idealWeightScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = IdealWeightRoute,
    ) {
        IdealWeightRoute(
            navigateBack = navigateBack,
        )
    }
}

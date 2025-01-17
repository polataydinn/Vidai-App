package com.tatari.vidai.presentation.bmr_calculator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val BmrCalculatorRoute = "BmrCalculatorRoute"

fun NavController.navigateToBmrCalculator(navOptions: NavOptions? = null) {
    this.navigate(BmrCalculatorRoute, navOptions)
}

fun NavGraphBuilder.bmrCalculatorScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = BmrCalculatorRoute,
    ) {
        BmrCalculatorRoute(
            navigateBack = navigateBack,
        )
    }
}

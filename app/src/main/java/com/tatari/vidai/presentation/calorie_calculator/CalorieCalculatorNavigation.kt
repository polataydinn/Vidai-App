package com.tatari.vidai.presentation.calorie_calculator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val CalorieCalculatorRoute = "CalorieCalculatorRoute"

fun NavController.navigateToCalorieCalculator(navOptions: NavOptions? = null) {
    this.navigate(CalorieCalculatorRoute, navOptions)
}

fun NavGraphBuilder.calorieCalculatorScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = CalorieCalculatorRoute,
    ) {
        CalorieCalculatorRoute(
            navigateBack = navigateBack,
        )
    }
}

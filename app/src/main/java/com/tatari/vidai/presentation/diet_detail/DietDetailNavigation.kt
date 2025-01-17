package com.tatari.vidai.presentation.diet_detail

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val DietDetailRoute = "DietDetailRoute"

fun NavController.navigateToDietDetail(navOptions: NavOptions? = null) {
    this.navigate(DietDetailRoute, navOptions)
}

fun NavGraphBuilder.dietDetailScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = DietDetailRoute,
    ) {
        DietDetailRoute(
            navigateBack = navigateBack,
        )
    }
}

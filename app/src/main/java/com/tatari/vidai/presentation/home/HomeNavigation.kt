package com.tatari.vidai.presentation.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val HomeRoute = "HomeRoute"

fun NavController.navigateToHome(navOptions: NavOptions? = null) {
    this.navigate(HomeRoute, navOptions)
}

fun NavGraphBuilder.homeScreen(
    navigateToLogin: () -> Unit,
) {
    composable(
        route = HomeRoute,
    ) {
        HomeRoute(
            navigateToLogin = navigateToLogin,
        )
    }
}
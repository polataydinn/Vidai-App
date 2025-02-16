package com.tatari.vidai.presentation.welcome

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val welcomeRoute = "welcome_route"

fun NavController.navigateToWelcomeScreen(navOptions: NavOptions? = null) {
    this.navigate(welcomeRoute, navOptions)
}

fun NavGraphBuilder.welcomeScreen(
    navigateToHome: () -> Unit,
    navigateToSignIn: () -> Unit,
) {
    composable(
        route = welcomeRoute,
    ) {
        WelcomeRoute(
            navigateToHome = navigateToHome,
            navigateToSignIn = navigateToSignIn,
        )
    }
}

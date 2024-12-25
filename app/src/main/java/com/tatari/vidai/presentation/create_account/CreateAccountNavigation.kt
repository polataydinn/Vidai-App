package com.tatari.vidai.presentation.create_account

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val CreateAccountRoute = "CreateAccountRoute"

fun NavController.navigateToCreateAccount(navOptions: NavOptions? = null) {
    this.navigate(CreateAccountRoute, navOptions)
}

fun NavGraphBuilder.createAccountScreen(
    navigateBack: () -> Unit,
    navigateToCreatePassword: () -> Unit,
) {
    composable(
        route = CreateAccountRoute,
    ) {
        CreateAccountRoute(
            navigateBack = navigateBack,
            navigateToCreatePassword = navigateToCreatePassword
        )
    }
}

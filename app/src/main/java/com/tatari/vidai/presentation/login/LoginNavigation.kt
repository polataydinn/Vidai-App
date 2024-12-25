package com.tatari.vidai.presentation.login

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val LoginRoute = "LoginRoute"

fun NavController.navigateToLogin(navOptions: NavOptions? = null) {
    this.navigate(LoginRoute, navOptions)
}

fun NavGraphBuilder.loginScreen(
    navigateBack: () -> Unit,
    navigateToForgetPassword: () -> Unit,
    navigateToCreateAccount: () -> Unit,
) {
    composable(
        route = LoginRoute,
    ) {
        LoginRoute(
            navigateBack = navigateBack,
            navigateToForgetPassword = navigateToForgetPassword,
            navigateToCreateAccount = navigateToCreateAccount
        )
    }
}

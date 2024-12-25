package com.tatari.vidai.presentation.forget_password

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val ForgetPasswordRoute = "ForgetPasswordRoute"

fun NavController.navigateToForgetPassword(navOptions: NavOptions? = null) {
    this.navigate(ForgetPasswordRoute, navOptions)
}

fun NavGraphBuilder.forgetPasswordScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = ForgetPasswordRoute,
    ) {
        ForgetPasswordRoute(
            navigateBack = navigateBack,
        )
    }
}

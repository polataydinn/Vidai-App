package com.tatari.vidai.presentation.verify_otp

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val VerifyOtpRoute = "VerifyOtpRoute"

fun NavController.navigateToVerifyOtp(navOptions: NavOptions? = null) {
    this.navigate(VerifyOtpRoute, navOptions)
}

fun NavGraphBuilder.verifyOtpScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = VerifyOtpRoute,
    ) {
        VerifyOtpRoute(
            navigateBack = navigateBack,
        )
    }
}

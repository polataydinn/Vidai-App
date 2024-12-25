package com.tatari.vidai.presentation.create_password

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val CreatePasswordRoute = "CreatePasswordRoute"

fun NavController.navigateToCreatePassword(navOptions: NavOptions? = null) {
    this.navigate(CreatePasswordRoute, navOptions)
}

fun NavGraphBuilder.createPasswordScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = CreatePasswordRoute,
    ) {
        CreatePasswordRoute(
            navigateBack = navigateBack,
        )
    }
}

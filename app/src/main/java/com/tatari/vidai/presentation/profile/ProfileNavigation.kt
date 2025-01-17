package com.tatari.vidai.presentation.profile

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val ProfileRoute = "ProfileRoute"

fun NavController.navigateToProfile(navOptions: NavOptions? = null) {
    this.navigate(ProfileRoute, navOptions)
}

fun NavGraphBuilder.profileScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = ProfileRoute,
    ) {
        ProfileRoute(
            navigateBack = navigateBack,
        )
    }
}

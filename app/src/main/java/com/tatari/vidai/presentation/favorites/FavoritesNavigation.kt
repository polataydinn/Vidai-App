package com.tatari.vidai.presentation.favorites

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val FavoritesRoute = "FavoritesRoute"

fun NavController.navigateToFavorites(navOptions: NavOptions? = null) {
    this.navigate(FavoritesRoute, navOptions)
}

fun NavGraphBuilder.favoritesScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = FavoritesRoute,
    ) {
        FavoritesRoute(
            navigateBack = navigateBack,
        )
    }
}

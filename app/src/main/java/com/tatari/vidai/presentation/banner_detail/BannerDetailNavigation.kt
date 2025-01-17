package com.tatari.vidai.presentation.banner_detail

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val BannerDetailRoute = "BannerDetailRoute"

fun NavController.navigateToBannerDetail(navOptions: NavOptions? = null) {
    this.navigate(BannerDetailRoute, navOptions)
}

fun NavGraphBuilder.bannerDetailScreen(
    navigateBack: () -> Unit,
) {
    composable(
        route = BannerDetailRoute,
    ) {
        BannerDetailRoute(
            navigateBack = navigateBack,
        )
    }
}

package com.tatari.vidai.navigation

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tatari.vidai.presentation.welcome.welcomeScreen
import com.tatari.vidai.ui.theme.AppBackground

@Composable
fun VidaiNavHost(
    navController: NavHostController,
    startDestination: String,
    modifier: Modifier = Modifier,
) {
    NavHost(
        modifier = modifier
            .background(AppBackground),
        navController = navController,
        startDestination = startDestination,
    ) {
        welcomeScreen {

        }

    }
}


package com.tatari.vidai.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tatari.vidai.presentation.login.loginScreen
import com.tatari.vidai.presentation.login.navigateToLogin
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
            .statusBarsPadding()
            .background(AppBackground),
        navController = navController,
        startDestination = startDestination,
    ) {
        welcomeScreen(
            navigateToSignIn = {
                navController.navigateToLogin()
            },
            navigateToHome = {
                //navController.navigate("SignUpRoute")
            }
        )

        loginScreen(
            navigateBack = {
                navController.popBackStack()
            }
        )
    }
}




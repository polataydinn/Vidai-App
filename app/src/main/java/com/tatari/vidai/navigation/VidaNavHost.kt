package com.tatari.vidai.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tatari.vidai.presentation.create_account.createAccountScreen
import com.tatari.vidai.presentation.create_account.navigateToCreateAccount
import com.tatari.vidai.presentation.create_password.createPasswordScreen
import com.tatari.vidai.presentation.create_password.navigateToCreatePassword
import com.tatari.vidai.presentation.forget_password.forgetPasswordScreen
import com.tatari.vidai.presentation.forget_password.navigateToForgetPassword
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
            },
            navigateToForgetPassword = {
                navController.navigateToForgetPassword()
            },
            navigateToCreateAccount = {
                navController.navigateToCreateAccount()
            }
        )

        forgetPasswordScreen(
            navigateBack = {
                navController.popBackStack()
            }
        )

        createAccountScreen(
            navigateBack = {
                navController.popBackStack()
            },
            navigateToCreatePassword = {
                navController.navigateToCreatePassword()
            }
        )

        createPasswordScreen(
            navigateBack = {
                navController.popBackStack()
            }
        )
    }
}




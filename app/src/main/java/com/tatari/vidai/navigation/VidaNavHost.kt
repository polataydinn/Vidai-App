package com.tatari.vidai.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.NavHost
import androidx.navigation.navOptions
import com.tatari.vidai.presentation.bmr_calculator.bmrCalculatorScreen
import com.tatari.vidai.presentation.bmr_calculator.navigateToBmrCalculator
import com.tatari.vidai.presentation.calorie_calculator.calorieCalculatorScreen
import com.tatari.vidai.presentation.calorie_calculator.navigateToCalorieCalculator
import com.tatari.vidai.presentation.create_account.createAccountScreen
import com.tatari.vidai.presentation.create_account.navigateToCreateAccount
import com.tatari.vidai.presentation.create_password.createPasswordScreen
import com.tatari.vidai.presentation.create_password.navigateToCreatePassword
import com.tatari.vidai.presentation.favorites.favoritesScreen
import com.tatari.vidai.presentation.favorites.navigateToFavorites
import com.tatari.vidai.presentation.forget_password.forgetPasswordScreen
import com.tatari.vidai.presentation.forget_password.navigateToForgetPassword
import com.tatari.vidai.presentation.home.homeScreen
import com.tatari.vidai.presentation.home.navigateToHome
import com.tatari.vidai.presentation.ideal_weight.idealWeightScreen
import com.tatari.vidai.presentation.ideal_weight.navigateToIdealWeight
import com.tatari.vidai.presentation.login.loginScreen
import com.tatari.vidai.presentation.login.navigateToLogin
import com.tatari.vidai.presentation.water_reminder.navigateToWaterReminder
import com.tatari.vidai.presentation.water_reminder.waterReminderScreen
import com.tatari.vidai.presentation.weight_tracker.navigateToWeightTracker
import com.tatari.vidai.presentation.weight_tracker.weightTrackerScreen
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
                navController.navigateToHome(
                    navOptions = navOptions {
                        popUpTo(startDestination) { inclusive = true }
                    },
                )
            },
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
            },

            navigateToHome = {
                navController.navigateToHome(
                    navOptions = navOptions {
                        popUpTo(startDestination) { inclusive = true }
                    },
                )
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
            },
            navigateToHome = {
                navController.navigateToHome(
                    navOptions = navOptions {
                        popUpTo(startDestination) { inclusive = true }
                    },
                )
            }
        )

        homeScreen(
            navigateToLogin = {
                navController.navigateToLogin(
                    navOptions = navOptions {
                        popUpTo(startDestination) { inclusive = true }
                    },
                )
            },
            navigateToWaterReminder = {
                navController.navigateToWaterReminder()
            },
            navigateToCalorieCalculator = {
                navController.navigateToCalorieCalculator()
            },
            navigateToIdealWeight = {
                navController.navigateToIdealWeight()
            },
            navigateToBMRCalculator = {
                navController.navigateToBmrCalculator()
            },
            navigateToWeightTracker = {
                navController.navigateToWeightTracker()
            },
            navigateToFavorites = {
                navController.navigateToFavorites()
            }
        )

        waterReminderScreen(
            navigateBack = {
                navController.popBackStack()
            }
        )

        calorieCalculatorScreen(
            navigateBack = {
                navController.popBackStack()
            }
        )

        idealWeightScreen(
            navigateBack = {
                navController.popBackStack()
            }
        )

        bmrCalculatorScreen(
            navigateBack = {
                navController.popBackStack()
            }
        )

        weightTrackerScreen(
            navigateBack = {
                navController.popBackStack()
            }
        )

        favoritesScreen(
            navigateBack = {
                navController.popBackStack()
            }
        )
    }
}




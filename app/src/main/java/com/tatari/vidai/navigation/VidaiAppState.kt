package com.tatari.vidai.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tatari.vidai.presentation.welcome.welcomeRoute
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberVidaiAppState(
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController: NavHostController = rememberNavController(),
): VidaiAppState {
    return remember(navController, coroutineScope) {
        VidaiAppState(navController, coroutineScope)
    }
}

@Stable
class VidaiAppState(
    val navController: NavHostController,
    val coroutineScope: CoroutineScope,
) {

    val startDestination: String
        get() = welcomeRoute
}

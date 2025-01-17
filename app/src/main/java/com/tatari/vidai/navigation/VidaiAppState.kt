package com.tatari.vidai.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.tatari.vidai.common.Session
import com.tatari.vidai.data.repository.getUser
import com.tatari.vidai.presentation.home.HomeRoute
import com.tatari.vidai.presentation.welcome.welcomeRoute
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

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
        get() = if (Firebase.auth.currentUser == null) {
            welcomeRoute
        } else {
            coroutineScope.launch {
                Session.createAccount = getUser()
            }
            HomeRoute
        }
}

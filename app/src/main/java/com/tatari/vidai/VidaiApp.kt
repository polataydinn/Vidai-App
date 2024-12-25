package com.tatari.vidai

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.tatari.vidai.navigation.VidaiAppState
import com.tatari.vidai.navigation.VidaiNavHost
import com.tatari.vidai.navigation.rememberVidaiAppState

@Composable
fun VidaiApp(
    appState: VidaiAppState = rememberVidaiAppState(),
) {
    VidaiNavHost(
        navController = appState.navController,
        startDestination = appState.startDestination,
        modifier = Modifier,
    )
}
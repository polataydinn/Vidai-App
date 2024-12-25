package com.tatari.vidai.presentation.welcome

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun WelcomeRoute(
    navigateToGoogle: () -> Unit,
    viewModel: WelcomeViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                WelcomeEffect.NavigateToGoogle -> navigateToGoogle()
            }
        }
    }

    WelcomeScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )
}

@Composable
fun WelcomeScreen(
    viewState: WelcomeState,
    onViewEvent: (WelcomeEvent) -> Unit
) {

}
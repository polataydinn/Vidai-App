package com.tatari.vidai.presentation.create_password

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color

@Composable
fun CreatePasswordRoute(
    navigateBack: () -> Unit,
    viewModel: CreatePasswordViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                CreatePasswordEffect.NavigateBack -> navigateBack()
            }
        }
    }

    CreatePasswordScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun CreatePasswordScreen(
    viewState: CreatePasswordState,
    onViewEvent: (CreatePasswordEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CreatePasswordScreenPreview() {
    CreatePasswordScreen(
        viewState = CreatePasswordState(),
        onViewEvent = { }
    )
}

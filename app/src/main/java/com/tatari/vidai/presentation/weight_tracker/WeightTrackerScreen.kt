package com.tatari.vidai.presentation.weight_tracker

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
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color

@Composable
fun WeightTrackerRoute(
    navigateBack: () -> Unit,
    viewModel: WeightTrackerViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                WeightTrackerEffect.NavigateBack -> navigateBack()
            }
        }
    }

    WeightTrackerScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun WeightTrackerScreen(
    viewState: WeightTrackerState,
    onViewEvent: (WeightTrackerEvent) -> Unit
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
private fun WeightTrackerScreenPreview() {
    WeightTrackerScreen(
        viewState = WeightTrackerState(),
        onViewEvent = { }
    )
}

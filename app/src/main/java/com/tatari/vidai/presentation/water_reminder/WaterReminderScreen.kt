package com.tatari.vidai.presentation.water_reminder

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
fun WaterReminderRoute(
    navigateBack: () -> Unit,
    viewModel: WaterReminderViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                WaterReminderEffect.NavigateBack -> navigateBack()
            }
        }
    }

    WaterReminderScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun WaterReminderScreen(
    viewState: WaterReminderState,
    onViewEvent: (WaterReminderEvent) -> Unit
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
private fun WaterReminderScreenPreview() {
    WaterReminderScreen(
        viewState = WaterReminderState(),
        onViewEvent = { }
    )
}

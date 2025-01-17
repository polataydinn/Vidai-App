package com.tatari.vidai.presentation.bmr_calculator

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
fun BmrCalculatorRoute(
    navigateBack: () -> Unit,
    viewModel: BmrCalculatorViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                BmrCalculatorEffect.NavigateBack -> navigateBack()
            }
        }
    }

    BmrCalculatorScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun BmrCalculatorScreen(
    viewState: BmrCalculatorState,
    onViewEvent: (BmrCalculatorEvent) -> Unit
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
private fun BmrCalculatorScreenPreview() {
    BmrCalculatorScreen(
        viewState = BmrCalculatorState(),
        onViewEvent = { }
    )
}

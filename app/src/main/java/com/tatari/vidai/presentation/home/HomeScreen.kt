package com.tatari.vidai.presentation.home

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.tatari.vidai.ui.drawables.IcBackGround
import com.tatari.vidai.ui.drawables.IcHomeDescription
import com.tatari.vidai.ui.drawables.IcStart
import com.tatari.vidai.presentation.forget_password.ForgetPasswordEffect

@Composable
fun HomeRoute(
    navigateToLogin: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                HomeEffect.NavigateToLogin -> navigateToLogin()
            }
        }
    }

    HomeScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun HomeScreen(
    viewState: HomeState,
    onViewEvent: (HomeEvent) -> Unit
) {
    val colorStops = arrayOf(
        0f to Color(0xFF007AFF),
        1f to Color(0xFF004999),
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(colorStops = colorStops))

    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            imageVector = Icons.IcBackGround,
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )

        Column (
            modifier = Modifier.fillMaxSize()
        ){

            Image(
                modifier = Modifier
                    .padding(top = 50.dp)
                    .align(alignment = Alignment.End)
                    .padding(end = 20.dp)
                    .size(32.dp)
                    .clickable { onViewEvent(HomeEvent.OnLogOutClicked) },
                imageVector = Icons.Default.ExitToApp,
                contentDescription = null,
            )

            Image(
                modifier = Modifier
                    .padding(top = 175.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                imageVector = Icons.IcHomeDescription,
                contentDescription = null,
            )

            Image(
                imageVector = Icons.IcStart,
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 180.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(
        viewState = HomeState(),
        onViewEvent = {}
    )

}
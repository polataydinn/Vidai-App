package com.tatari.vidai.presentation.welcome

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.tatari.vidai.ui.drawables.IcLoginWithAccount
import com.tatari.vidai.ui.drawables.IcSignInWithGoogle
import com.tatari.vidai.ui.drawables.IcWelcomeLogo
import com.tatari.vidai.ui.theme.AppBackground

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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = AppBackground)
    ) {

        Image(
            modifier = Modifier
                .padding(top = 150.dp)
                .align(Alignment.CenterHorizontally),
            imageVector = Icons.IcWelcomeLogo,
            contentDescription = "Welcome Logo",
        )

        Row(
            modifier = Modifier
                .padding(top = 250.dp)
                .wrapContentSize()
                .align(Alignment.CenterHorizontally)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(8.dp)
                ),
        ) {
            Image(
                modifier = Modifier,
                imageVector = Icons.IcSignInWithGoogle,
                contentDescription = "Welcome Logo",
            )
        }

        Text(
            modifier = Modifier
                .padding(top = 20.dp)
                .align(Alignment.CenterHorizontally),
            text = "---------------------------- yada ----------------------------",
            style = TextStyle(
                color = Color.Gray
            )
        )

        Image(
            modifier = Modifier
                .padding(top = 20.dp)
                .align(Alignment.CenterHorizontally),
            imageVector = Icons.IcLoginWithAccount,
            contentDescription = "Welcome Logo",
            contentScale = ContentScale.Fit
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun WelcomeScreenPreview() {
    WelcomeScreen(
        viewState = WelcomeState(),
        onViewEvent = {}
    )
}
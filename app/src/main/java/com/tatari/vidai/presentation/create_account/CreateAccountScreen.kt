package com.tatari.vidai.presentation.create_account

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcCreateAccount
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcCreateAccountHeader
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcCreateAccountText
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmail
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmailError
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmailSelected
import com.tatari.vidai.R
import com.tatari.vidai.presentation.components.VidaiEditText
import com.tatari.vidai.presentation.login.AuthContainer
import com.tatari.vidai.presentation.login.LoginEvent
import com.tatari.vidai.presentation.login.LoginHeader

@Composable
fun CreateAccountRoute(
    navigateBack: () -> Unit,
    viewModel: CreateAccountViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                CreateAccountEffect.NavigateBack -> navigateBack()
            }
        }
    }

    CreateAccountScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun CreateAccountScreen(
    viewState: CreateAccountState,
    onViewEvent: (CreateAccountEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        LoginHeader(
            image = Icons.IcCreateAccountHeader
        )

        AuthContainer(
            modifier = Modifier.weight(1f)
        ) {
            Image(
                imageVector = Icons.IcCreateAccountText,
                contentDescription = null
            )

            VidaiEditText(
                modifier = Modifier.padding(top = if (viewState.isNameError) 8.dp else 50.dp),
                value = viewState.name.orEmpty(),
                onValueChange = { onViewEvent(CreateAccountEvent.OnNameChanged(it)) },
                label = "E-mail",
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                ),
                isError = viewState.isNameError,
            )
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CreateAccountScreenPreview() {
    CreateAccountScreen(
        viewState = CreateAccountState(),
        onViewEvent = { }
    )
}

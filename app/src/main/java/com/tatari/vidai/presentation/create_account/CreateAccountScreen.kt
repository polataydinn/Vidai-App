package com.tatari.vidai.presentation.create_account

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tatari.vidai.ui.drawables.IcAlreadyHasAnAccountText
import com.tatari.vidai.ui.drawables.IcCreateAccountHeader
import com.tatari.vidai.ui.drawables.IcCreateAccountText
import com.tatari.vidai.ui.drawables.IcSendButton
import com.tatari.vidai.R
import com.tatari.vidai.presentation.components.VidaiEditText
import com.tatari.vidai.presentation.login.AuthContainer
import com.tatari.vidai.presentation.login.LoginHeader
import kotlinx.coroutines.launch

@Composable
fun CreateAccountRoute(
    navigateBack: () -> Unit,
    navigateToCreatePassword: () -> Unit,
    viewModel: CreateAccountViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                CreateAccountEffect.NavigateBack -> navigateBack()
                CreateAccountEffect.NavigateToCreatePassword -> navigateToCreatePassword()
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
    val context = LocalContext.current

    if (viewState.isGeneralError) {
        Toast.makeText(context, "Bütün Alanları Doldurunuz", Toast.LENGTH_SHORT).show()
        onViewEvent(CreateAccountEvent.OnGeneralErrorShown)
    }
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
                modifier = Modifier.padding(top = 50.dp),
                value = viewState.name.orEmpty(),
                onValueChange = { onViewEvent(CreateAccountEvent.OnNameChanged(it)) },
                label = "İsim",
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                ),
                isError = viewState.isNameError,
            )

            VidaiEditText(
                modifier = Modifier.padding(top = 8.dp),
                value = viewState.surname.orEmpty(),
                onValueChange = { onViewEvent(CreateAccountEvent.OnSurnameChanged(it)) },
                label = "Soyisim",
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                ),
                isError = viewState.isSurNameError,
            )

            VidaiEditText(
                modifier = Modifier.padding(top = 8.dp),
                value = viewState.email.orEmpty(),
                onValueChange = { onViewEvent(CreateAccountEvent.OnEmailChanged(it)) },
                label = "E-mail",
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                ),
                isError = viewState.isEmailError,
            )

            Image(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally)
                    .clickable {
                        onViewEvent(CreateAccountEvent.OnContinueClicked)
                    },
                imageVector = Icons.IcSendButton,
                contentDescription = "Welcome Logo",
                contentScale = ContentScale.Fit
            )

            Image(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally)
                    .clickable {
                        onViewEvent(CreateAccountEvent.OnBackClicked)
                    },
                imageVector = Icons.IcAlreadyHasAnAccountText,
                contentDescription = null
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

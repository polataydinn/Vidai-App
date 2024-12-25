package com.tatari.vidai.presentation.forget_password

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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcForgetPasswordDescription
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcForgetPasswordHeader
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcSendButton
import com.tatari.vidai.R
import com.tatari.vidai.presentation.components.VidaiEditText
import com.tatari.vidai.presentation.login.AuthContainer
import com.tatari.vidai.presentation.login.LoginHeader

@Composable
fun ForgetPasswordRoute(
    navigateBack: () -> Unit,
    viewModel: ForgetPasswordViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()
    val context = LocalContext.current

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                ForgetPasswordEffect.NavigateBack -> navigateBack()
                ForgetPasswordEffect.ContinueClicked -> {
                    navigateBack()
                    Toast.makeText(context, "Email hesabınıza şifre yenileme linki iletilmiştir.", Toast.LENGTH_SHORT).show()
                }
                is ForgetPasswordEffect.OnError -> {
                    Toast.makeText(context, effect.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    ForgetPasswordScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun ForgetPasswordScreen(
    viewState: ForgetPasswordState,
    onViewEvent: (ForgetPasswordEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LoginHeader(
            image = Icons.IcForgetPasswordHeader,
        )
        AuthContainer(
            modifier = Modifier.weight(1f)
        ) {
            Image(
                imageVector = Icons.IcForgetPasswordDescription,
                contentDescription = null,
                modifier = Modifier
            )

            VidaiEditText(
                modifier = Modifier.padding(top = 70.dp),
                value = viewState.email.orEmpty(),
                onValueChange = { onViewEvent(ForgetPasswordEvent.OnEmailChange(it)) },
                label = "E-mail",
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                ),
            )

            Image(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally)
                    .clickable {
                        onViewEvent(ForgetPasswordEvent.OnContinueClicked)
                    },
                imageVector = Icons.IcSendButton,
                contentDescription = "Welcome Logo",
                contentScale = ContentScale.Fit
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ForgetPasswordScreenPreview() {
    ForgetPasswordScreen(
        viewState = ForgetPasswordState(),
        onViewEvent = { }
    )
}

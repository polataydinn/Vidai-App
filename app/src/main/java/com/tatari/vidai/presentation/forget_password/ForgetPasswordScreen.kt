package com.tatari.vidai.presentation.forget_password

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcCreateAccountHeader
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLock
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLockError
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLockSelected
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcPasswordOff
import com.tatari.vidai.R
import com.tatari.vidai.presentation.components.VidaiEditText
import com.tatari.vidai.presentation.login.AuthContainer
import com.tatari.vidai.presentation.login.LoginEvent
import com.tatari.vidai.presentation.login.LoginHeader
import com.tatari.vidai.presentation.verify_otp.VerifyOtpState

@Composable
fun ForgetPasswordRoute(
    navigateBack: () -> Unit,
    viewModel: ForgetPasswordViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                ForgetPasswordEffect.NavigateBack -> navigateBack()
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
            image = Icons.IcCreateAccountHeader,
        )
        AuthContainer(
            modifier = Modifier.weight(1f)
        ) {
            EnterPasswordContent(viewState, onViewEvent)
        }
    }
}

@Composable
fun EnterPasswordContent(
    viewState: ForgetPasswordState,
    onViewEvent: (ForgetPasswordEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Row {
            Text(
                text = "·  Lütfen yeni şifre oluşturun",
                style = MaterialTheme.typography.labelSmall,
            )
        }
        VidaiEditText(
            modifier = Modifier.padding(top = 20.dp),
            value = viewState.firstPassword,
            onValueChange = { onViewEvent(ForgetPasswordEvent.FirstPasswordChanged(it)) },
            label = "Şifre",
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            ),
            leadingIcon = Icons.IcLock,
            leadingIconFocused = Icons.IcLockSelected,
            leadingIconError = Icons.IcLockError,
            isError = false,
            visualTransformation = if (viewState.passwordVisibility) {
                PasswordVisualTransformation()
            } else VisualTransformation.None,
            trailingIcon = {
                IconButton(onClick = { onViewEvent(ForgetPasswordEvent.PasswordVisibilityChanged) }) {
                    if (viewState.passwordVisibility) {
                        Icons.IcPasswordOff
                    } else {
                        Icons.Filled.AddCircle
                    }
                }
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Password 1") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Confirm password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Reset password")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ForgetPasswordScreenPreview() {
    ForgetPasswordScreen(
        viewState = ForgetPasswordState(
            isLoading = false,
            passwordVisibility = false,
            firstPassword = "",
            secondPassword = ""
        ),
        onViewEvent = { }
    )
}

package com.tatari.vidai.presentation.verify_otp

import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tatari.vidai.ui.drawables.IcCreateAccount
import com.tatari.vidai.ui.drawables.IcCreateAccountHeader
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLock
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLockError
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLockSelected
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcPasswordOff
import com.tatari.vidai.R
import com.tatari.vidai.presentation.components.VidaiEditText
import com.tatari.vidai.presentation.login.AuthContainer
import com.tatari.vidai.presentation.login.LoginEvent
import com.tatari.vidai.presentation.login.LoginHeader

@Composable
fun VerifyOtpRoute(
    navigateBack: () -> Unit,
    viewModel: VerifyOtpViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                VerifyOtpEffect.NavigateBack -> navigateBack()
            }
        }
    }

    VerifyOtpScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun VerifyOtpScreen(
    viewState: VerifyOtpState,
    onViewEvent: (VerifyOtpEvent) -> Unit
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

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun VerifyOtpScreenPreview() {
    VerifyOtpScreen(
        viewState = VerifyOtpState(),
        onViewEvent = { }
    )
}

package com.tatari.vidai.presentation.login

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.tatari.vidai.ui.drawables.IcCreateAccount
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmail
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmailError
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmailSelected
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLock
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLockError
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLockSelected
import com.tatari.vidai.ui.drawables.IcLoginButton
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcPasswordOff
import com.tatari.vidai.ui.drawables.IcWelcomeAgain
import com.tatari.vidai.R
import com.tatari.vidai.presentation.components.VidaiEditText
import com.tatari.vidai.ui.theme.DarkBlue
import com.tatari.vidai.ui.theme.DarkGray

@Composable
fun LoginRoute(
    navigateBack: () -> Unit,
    navigateToForgetPassword: () -> Unit,
    navigateToCreateAccount: () -> Unit,
    navigateToHome: () -> Unit,
    viewModel: LoginViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()
    val context = LocalContext.current

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                LoginEffect.NavigateBack -> navigateBack()
                LoginEffect.NavigateToForgetPassword -> navigateToForgetPassword()
                LoginEffect.NavigateToCreateAccount -> navigateToCreateAccount()
                LoginEffect.NavigateToHome -> navigateToHome()
                is LoginEffect.ShowError -> {
                    Toast.makeText(context, effect.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    LoginScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun LoginScreen(
    viewState: LoginState,
    onViewEvent: (LoginEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LoginHeader()
        AuthContainer(
            modifier = Modifier.weight(1f)
        ) {
            VidaiEditText(
                modifier = Modifier.padding(top = if (viewState.isError) 8.dp else 50.dp),
                value = viewState.email,
                onValueChange = { onViewEvent(LoginEvent.EmailChanged(it)) },
                label = "E-mail",
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                ),
                leadingIcon = Icons.IcEmail,
                leadingIconFocused = Icons.IcEmailSelected,
                leadingIconError = Icons.IcEmailError,
                isError = viewState.isError,
            )

            VidaiEditText(
                modifier = Modifier.padding(top = 20.dp),
                value = viewState.password,
                onValueChange = { onViewEvent(LoginEvent.PasswordChanged(it)) },
                label = "Şifre",
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                ),
                leadingIcon = Icons.IcLock,
                leadingIconFocused = Icons.IcLockSelected,
                leadingIconError = Icons.IcLockError,
                isError = viewState.isError,
                visualTransformation = if (viewState.passwordVisibility) {
                    PasswordVisualTransformation()
                } else VisualTransformation.None,
                trailingIcon = {
                    IconButton(onClick = { onViewEvent(LoginEvent.PasswordVisibilityChanged) }) {
                        if (viewState.passwordVisibility) {
                            Icons.IcPasswordOff
                        } else {
                            Icons.Filled.AddCircle
                        }
                    }
                }
            )

            Row(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Switch(
                        checked = viewState.isRememberMe,
                        onCheckedChange = { onViewEvent(LoginEvent.RememberMeChanged) },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = DarkBlue,
                            uncheckedThumbColor = DarkBlue,
                            uncheckedTrackColor = Color.Transparent,
                            uncheckedBorderColor = DarkBlue,
                            uncheckedIconColor = DarkBlue,
                        ),
                    )

                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "Beni Hatırla",
                        style = TextStyle(
                            color = DarkGray,
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        ),
                    )
                }

                Text(
                    modifier = Modifier.clickable { onViewEvent(LoginEvent.OnForgetPasswordClicked) },
                    text = "Şifremi Unuttum",
                    style = TextStyle(
                        color = DarkGray,
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular))
                    ),
                )
            }

            Image(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally)
                    .clickable(enabled = viewState.isLoginEnabled) {
                        onViewEvent(LoginEvent.OnSignInClicked)
                    },
                imageVector = Icons.IcLoginButton,
                contentDescription = "Welcome Logo",
                contentScale = ContentScale.Fit
            )

            Image(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally)
                    .clickable {
                        onViewEvent(LoginEvent.OnCreateAccountClicked)
                    },
                imageVector = Icons.IcCreateAccount,
                contentDescription = "Welcome Logo",
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun AuthContainer(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 32.dp)
            .shadow(4.dp, shape = RoundedCornerShape(16.dp))
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            content()
        }
    }
}

@Composable
fun LoginHeader(
    image: ImageVector = Icons.IcWelcomeAgain
) {
    Image(
        modifier = Modifier
            .padding(top = 50.dp)
            .fillMaxWidth()
            .height(200.dp)
            .padding(start = 16.dp),
        imageVector = image,
        contentDescription = null,
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen(
        viewState = LoginState(),
        onViewEvent = { }
    )
}

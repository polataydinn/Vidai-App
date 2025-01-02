package com.tatari.vidai.presentation.create_password

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.tatari.vidai.ui.drawables.IcAlreadyHasAnAccountText
import com.tatari.vidai.ui.drawables.IcCheckError
import com.tatari.vidai.ui.drawables.IcCheckSuccess
import com.tatari.vidai.ui.drawables.IcCreateAccountButton
import com.tatari.vidai.ui.drawables.IcCreateAccountHeader
import com.tatari.vidai.ui.drawables.IcLoginButton
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcPasswordOff
import com.tatari.vidai.R
import com.tatari.vidai.presentation.components.VidaiEditText
import com.tatari.vidai.presentation.create_account.CreateAccountEvent
import com.tatari.vidai.presentation.login.AuthContainer
import com.tatari.vidai.presentation.login.LoginEvent
import com.tatari.vidai.presentation.login.LoginHeader

@Composable
fun CreatePasswordRoute(
    navigateBack: () -> Unit,
    navigateToHome: () -> Unit,
    viewModel: CreatePasswordViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()
    val context = LocalContext.current

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                CreatePasswordEffect.NavigateBack -> navigateBack()
                CreatePasswordEffect.NavigateToHome -> navigateToHome()
                is CreatePasswordEffect.OnError -> {
                    Toast.makeText(context, effect.errorMessage, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    CreatePasswordScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun CreatePasswordScreen(
    viewState: CreatePasswordState,
    onViewEvent: (CreatePasswordEvent) -> Unit
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
    viewState: CreatePasswordState,
    onViewEvent: (CreatePasswordEvent) -> Unit,
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
        VidaiEditText(modifier = Modifier.padding(top = 20.dp),
            value = viewState.firstPassword,
            onValueChange = { onViewEvent(CreatePasswordEvent.FirstPasswordChanged(it)) },
            label = "Şifre",
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            ),
            isError = false,
            visualTransformation = if (viewState.passwordVisibility) {
                PasswordVisualTransformation()
            } else VisualTransformation.None,
            trailingIcon = {
                IconButton(enabled = true, onClick = {
                    onViewEvent(CreatePasswordEvent.PasswordVisibilityChanged)
                }) {
                    Icon(
                        contentDescription = null,
                        tint = Color(0xFFC2C3CB),
                        imageVector = Icons.IcPasswordOff
                    )
                }
            })
        Spacer(modifier = Modifier.height(16.dp))

        viewState.passwordConstraints.forEach {
            PasswordConstraint(constraint = it)
        }
        PasswordConstraint(
            constraint = PasswordConstraint(
                PasswordConstraintType.MATCH_WITH_FIRST,
                "Şifreler eşleşmeli",
                viewState.secondPasswordMatch
            )
        )

        VidaiEditText(modifier = Modifier.padding(top = 20.dp),
            value = viewState.secondPassword,
            onValueChange = { onViewEvent(CreatePasswordEvent.SecondPasswordChanged(it)) },
            label = "Şifreyi Onayla",
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            ),
            isError = false,
            visualTransformation = if (viewState.passwordVisibility) {
                PasswordVisualTransformation()
            } else VisualTransformation.None,
            trailingIcon = {
                IconButton(enabled = true, onClick = {
                    onViewEvent(CreatePasswordEvent.PasswordVisibilityChanged)
                }) {
                    Icon(
                        contentDescription = null,
                        tint = Color(0xFFC2C3CB),
                        imageVector = Icons.IcPasswordOff
                    )
                }
            })

        Image(
            modifier = Modifier
                .padding(top = 20.dp)
                .align(Alignment.CenterHorizontally)
                .clickable(enabled = viewState.isButtonEnabled) {
                    onViewEvent(CreatePasswordEvent.OnCreateAccount)
                },
            imageVector = Icons.IcCreateAccountButton,
            contentDescription = "Welcome Logo",
            contentScale = ContentScale.Fit
        )


        Image(
            modifier = Modifier
                .padding(top = 20.dp)
                .align(Alignment.CenterHorizontally)
                .clickable {
                    onViewEvent(CreatePasswordEvent.OnLoginClicked)
                },
            imageVector = Icons.IcAlreadyHasAnAccountText,
            contentDescription = null
        )
    }
}

@Composable
fun PasswordConstraint(modifier: Modifier = Modifier, constraint: PasswordConstraint) {
    Row {
        Image(
            imageVector = if (constraint.isValid) Icons.IcCheckSuccess else Icons.IcCheckError,
            contentDescription = null,
            modifier = Modifier.padding(end = 8.dp)
        )
        Text(
            text = constraint.text,
            style = MaterialTheme.typography.labelSmall,
            modifier = modifier
        )

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CreatePasswordScreenPreview() {
    CreatePasswordScreen(
        viewState = CreatePasswordState(),
        onViewEvent = { }
    )
}

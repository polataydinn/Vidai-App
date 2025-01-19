package com.tatari.vidai.presentation.bmr_calculator

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.tatari.vidai.R
import com.tatari.vidai.presentation.BackButton
import com.tatari.vidai.presentation.components.VidaiEditText
import com.tatari.vidai.presentation.ideal_weight.DailyIdealWeightCard
import com.tatari.vidai.presentation.ideal_weight.GenderSelection

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
            .background(color = Color.White)
            .systemBarsPadding()
            .statusBarsPadding()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
    ) {

        BackButton(onClick = { onViewEvent(BmrCalculatorEvent.OnBackClicked) })

        Text(
            text = "BMR Hesaplama",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            ),
            modifier = Modifier.padding(top = 18.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_bmr_calculator_banner),
            contentDescription = "Calorie Image",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp)
        )

        GenderSelection(
            viewState.selectedGender,
            onGenderChanged = { onViewEvent(BmrCalculatorEvent.OnGenderChanged(it)) }
        )

        VidaiEditText(
            modifier = Modifier.padding(top = 16.dp),
            value = viewState.weight.orEmpty(),
            onValueChange = { onViewEvent(BmrCalculatorEvent.OnWeightChanged(it)) },
            label = "Kilo (kg)",
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            ),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
        )

        VidaiEditText(
            modifier = Modifier.padding(top = 16.dp),
            value = viewState.height.orEmpty(),
            onValueChange = { onViewEvent(BmrCalculatorEvent.OnHeightChanged(it)) },
            label = "Boyunuz (cm)",
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            ),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
        )

        VidaiEditText(
            modifier = Modifier.padding(top = 16.dp),
            value = viewState.age.orEmpty(),
            onValueChange = { onViewEvent(BmrCalculatorEvent.OnAgeChanged(it)) },
            label = "Yaş",
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            ),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_calculate),
            contentDescription = "Calorie Image",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp)
                .clickable { onViewEvent(BmrCalculatorEvent.OnCalculateClicked) }
        )

        AnimatedVisibility(
            viewState.showBmrCard && viewState.calculatedValue.isNullOrBlank().not()
        ) {
            DailyIdealWeightCard(
                weight = viewState.calculatedValue.orEmpty(),
                text = "BMR Değeriniz"
            )
        }

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

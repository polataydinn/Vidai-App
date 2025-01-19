package com.tatari.vidai.presentation.calorie_calculator

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.tatari.vidai.R
import com.tatari.vidai.presentation.BackButton
import com.tatari.vidai.presentation.components.VidaiEditText

@Composable
fun CalorieCalculatorRoute(
    navigateBack: () -> Unit,
    viewModel: CalorieCalculatorViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                CalorieCalculatorEffect.NavigateBack -> navigateBack()
            }
        }
    }

    CalorieCalculatorScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun CalorieCalculatorScreen(
    viewState: CalorieCalculatorState,
    onViewEvent: (CalorieCalculatorEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .systemBarsPadding()
            .statusBarsPadding()
            .padding(16.dp),
    ) {

        BackButton(onClick = { onViewEvent(CalorieCalculatorEvent.OnBackClicked) })

        Text(
            text = "Kalori Hedefi",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            ),
            modifier = Modifier.padding(top = 18.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_calorie_calculator),
            contentDescription = "Calorie Image",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp)
        )

        VidaiEditText(
            modifier = Modifier.padding(top = 28.dp),
            value = viewState.bmrValue.orEmpty(),
            onValueChange = { onViewEvent(CalorieCalculatorEvent.OnBmrValueChanged(it)) },
            label = "BMR Değeri",
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
                .clickable { onViewEvent(CalorieCalculatorEvent.OnCalculateClicked) }
        )

        AnimatedVisibility(
            viewState.showCalorieCard && viewState.calculatedValue.isNullOrBlank().not()
        ) {
            DailyCalorieCard(calorie = viewState.calculatedValue.orEmpty())
        }
    }
}

@Composable
fun DailyCalorieCard(calorie: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(28.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Günlük Kalori İhtiyacınız",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Normal
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "$calorie",
                style = TextStyle(
                    fontSize = 36.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "kcal/gün",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Normal
                )
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CalorieCalculatorScreenPreview() {
    CalorieCalculatorScreen(
        viewState = CalorieCalculatorState(),
        onViewEvent = { }
    )
}

package com.tatari.vidai.presentation.ideal_weight

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.tatari.vidai.presentation.calorie_calculator.CalorieCalculatorEvent
import com.tatari.vidai.presentation.calorie_calculator.DailyCalorieCard
import com.tatari.vidai.presentation.components.VidaiEditText

@Composable
fun IdealWeightRoute(
    navigateBack: () -> Unit,
    viewModel: IdealWeightViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                IdealWeightEffect.NavigateBack -> navigateBack()
            }
        }
    }

    IdealWeightScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun IdealWeightScreen(
    viewState: IdealWeightState,
    onViewEvent: (IdealWeightEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .systemBarsPadding()
            .statusBarsPadding()
            .padding(16.dp),
    ) {

        BackButton(onClick = { onViewEvent(IdealWeightEvent.OnBackClicked) })

        Text(
            text = "İdeal Kilo",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            ),
            modifier = Modifier.padding(top = 18.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_ideal_weight_banner),
            contentDescription = "Calorie Image",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp)
        )

        GenderSelection(
            viewState.selectedGender,
            onGenderChanged = { onViewEvent(IdealWeightEvent.OnGenderChanged(it)) }
        )

        VidaiEditText(
            modifier = Modifier.padding(top = 16.dp),
            value = viewState.height.orEmpty(),
            onValueChange = { onViewEvent(IdealWeightEvent.OnHeightChanged(it)) },
            label = "Boyunuz (cm)",
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
                .clickable { onViewEvent(IdealWeightEvent.OnCalculateClicked) }
        )

        AnimatedVisibility(
            viewState.showIdealWeightCard && viewState.calculatedValue.isNullOrBlank().not()
        ) {
            DailyIdealWeightCard(weight = viewState.calculatedValue.orEmpty())
        }

    }
}

@Composable
fun DailyIdealWeightCard(
    weight: String,
    text: String = "İdeal Kilonuz"
) {
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
                text = text,
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Normal
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "$weight kg",
                style = TextStyle(
                    fontSize = 36.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
        }
    }
}

@Composable
fun GenderSelection(
    selectedGender: Gender = Gender.WOMAN,
    onGenderChanged: (Gender) -> Unit = { }
) {

    Column(
        modifier = Modifier
            .padding(top = 28.dp)
    ) {
        Text(
            text = "Cinsiyet",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFFF5F5F5))
                .padding(4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            GenderOption(
                text = "Kadın",
                isSelected = selectedGender == Gender.WOMAN,
                onClick = { onGenderChanged(Gender.WOMAN)},
                modifier = Modifier.weight(1f)
            )
            GenderOption(
                text = "Erkek",
                isSelected = selectedGender == Gender.MAN,
                onClick = { onGenderChanged(Gender.MAN)},
                modifier = Modifier.weight(1f)

            )
        }
    }
}



@Composable
fun GenderOption(
    modifier: Modifier = Modifier,
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(if (isSelected) Color.White else Color(0xFFF5F5F5))
            .border(
                width = 1.dp,
                color = if (isSelected) Color(0xFF6200EE) else Color.Transparent,
                shape = RoundedCornerShape(12.dp)
            )
            .clickable(onClick = onClick)
            .padding(vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                color = if (isSelected) Color.Black else Color.Gray
            )
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun IdealWeightScreenPreview() {
    IdealWeightScreen(
        viewState = IdealWeightState(),
        onViewEvent = { }
    )
}

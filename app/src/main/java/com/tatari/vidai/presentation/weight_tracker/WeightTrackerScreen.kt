package com.tatari.vidai.presentation.weight_tracker

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
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
import com.patrykandpatrick.vico.compose.axis.axisLabelComponent
import com.patrykandpatrick.vico.compose.axis.horizontal.rememberBottomAxis
import com.patrykandpatrick.vico.compose.axis.vertical.rememberStartAxis
import com.patrykandpatrick.vico.compose.chart.Chart
import com.patrykandpatrick.vico.compose.chart.line.lineChart
import com.patrykandpatrick.vico.core.axis.formatter.AxisValueFormatter
import com.patrykandpatrick.vico.core.chart.line.LineChart
import com.patrykandpatrick.vico.core.component.shape.shader.DynamicShader
import com.patrykandpatrick.vico.core.entry.ChartEntry
import com.patrykandpatrick.vico.core.entry.ChartEntryModelProducer
import com.tatari.vidai.R
import com.tatari.vidai.presentation.BackButton
import com.tatari.vidai.presentation.components.VidaiEditText

@Composable
fun WeightTrackerRoute(
    navigateBack: () -> Unit,
    viewModel: WeightTrackerViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                WeightTrackerEffect.NavigateBack -> navigateBack()
            }
        }
    }

    WeightTrackerScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeightTrackerScreen(
    viewState: WeightTrackerState,
    onViewEvent: (WeightTrackerEvent) -> Unit
) {

    val datePickerState =
        rememberDatePickerState(initialSelectedDateMillis = System.currentTimeMillis())

    if (viewState.isShowDatePicker) {
        DatePickerDialog(
            onDismissRequest = { onViewEvent(WeightTrackerEvent.OnDateDialogDismissed) },
            confirmButton = {
                Button(
                    modifier = Modifier.padding(24.dp),
                ) {
                    onViewEvent(WeightTrackerEvent.OnDateSelected(datePickerState.selectedDateMillis))
                }
            },
        ) {
            DatePicker(
                state = datePickerState,
            )
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .systemBarsPadding()
            .statusBarsPadding()
            .padding(16.dp),
    ) {
        BackButton(onClick = { onViewEvent(WeightTrackerEvent.OnBackClicked) })

        Text(
            text = "Kilo Takibi",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            ),
            modifier = Modifier.padding(top = 18.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            WeightCard(
                text = "Başlangıç",
                weight = viewState.firstWeight,
                modifier = Modifier.weight(1f)
            )

            WeightCard(
                text = "Güncel",
                weight = viewState.lastWeight,
                modifier = Modifier.weight(1f)
            )
        }

        TimePeriodSelection(
            timePeriod = viewState.timePeriod,
            onTimePeriodChanged = { onViewEvent(WeightTrackerEvent.OnTimePeriodChanged(it)) }
        )

        VidaiEditText(
            modifier = Modifier.padding(top = 16.dp),
            value = viewState.weight.orEmpty(),
            onValueChange = { onViewEvent(WeightTrackerEvent.OnWeightChanged(it)) },
            label = "Kilo (kg)",
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            ),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
        )

        Button {
            onViewEvent(WeightTrackerEvent.OnSaveClicked)
        }

        if (viewState.showChart) {
            WeightChart(
                modifier = Modifier.padding(top = 16.dp),
                listOfWeight = viewState.weightList
            )

        }
    }
}

@Composable
fun Button(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Row(
        modifier = modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
            .height(50.dp)
            .background(
                color = Color(0xFF007AFF),
                shape = RoundedCornerShape(12.dp)
            )
            .clickable { onClick() },
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            "Kaydet",
            style = TextStyle(
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            )
        )
    }
}

data class WeightEntry(
    override val x: Float,
    override val y: Float,
) : ChartEntry {
    override fun withY(y: Float) = WeightEntry(x, y)
}

@Composable
fun WeightChart(
    modifier: Modifier = Modifier,
    listOfWeight: List<WeightEntry>,
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {


        val greenLineChart = lineChart(
            lines = listOf(
                LineChart.LineSpec(
                    lineColor = 0xFF00FF00.toInt(),
                    lineThicknessDp = 2f,
                    lineBackgroundShader = DynamicShader { _, _, _, _, _ ->
                        LinearGradientShader(
                            colors = listOf(
                                Color.Green,
                                Color.Green.copy(alpha = 0.25f)
                            ),
                            from = Offset.Zero,
                            to = Offset.Zero,
                        )
                    }
                )
            )
        )

        Chart(
            chart = greenLineChart,
            chartModelProducer = ChartEntryModelProducer(listOfWeight),
            startAxis = rememberStartAxis(),
            bottomAxis = rememberBottomAxis(
                valueFormatter = AxisValueFormatter { value, _ ->
                    when (listOfWeight.find { it.x == value } == null) {
                        true -> return@AxisValueFormatter ""
                        false -> return@AxisValueFormatter "${value.toInt()}"
                    }
                },
                label = axisLabelComponent(
                    textSize = 10.sp,
                ),
            ),
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }

}

@Composable
fun WeightCard(
    text: String,
    weight: String,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(8.dp)
            ),
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_diet_list),
            contentDescription = "Weight Image",
            modifier = Modifier
                .padding(8.dp)
        )

        Column(
            modifier = Modifier
                .padding(8.dp)
                .padding(top = 8.dp)
        ) {
            Text(
                text = text,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                ),

                )

            Text(
                text = "$weight kg",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
                ),
            )
        }
    }
}

@Composable
fun TimePeriodSelection(
    modifier: Modifier = Modifier,
    timePeriod: TimePeriod = TimePeriod.WEEK,
    onTimePeriodChanged: (TimePeriod) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFF5F5F5))
            .padding(4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TimePeriodOption(
            text = "Hafta",
            isSelected = timePeriod == TimePeriod.WEEK,
            onClick = { onTimePeriodChanged(TimePeriod.WEEK) },
            modifier = Modifier.weight(1f)
        )
        TimePeriodOption(
            text = "Ay",
            isSelected = timePeriod == TimePeriod.MONTH,
            onClick = { onTimePeriodChanged(TimePeriod.MONTH) },
            modifier = Modifier.weight(1f)
        )
        TimePeriodOption(
            text = "3 Ay",
            isSelected = timePeriod == TimePeriod.THREE_MONTHS,
            onClick = { onTimePeriodChanged(TimePeriod.THREE_MONTHS) },
            modifier = Modifier.weight(1f)
        )
        TimePeriodOption(
            text = "Yıl",
            isSelected = timePeriod == TimePeriod.YEAR,
            onClick = { onTimePeriodChanged(TimePeriod.YEAR) },
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun TimePeriodOption(
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
private fun WeightTrackerScreenPreview() {
    WeightTrackerScreen(
        viewState = WeightTrackerState(),
        onViewEvent = { }
    )
}

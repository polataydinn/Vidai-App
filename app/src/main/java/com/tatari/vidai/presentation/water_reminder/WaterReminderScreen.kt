package com.tatari.vidai.presentation.water_reminder

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tatari.vidai.R
import com.tatari.vidai.presentation.BackButton

@Composable
fun WaterReminderRoute(
    navigateBack: () -> Unit,
    viewModel: WaterReminderViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                WaterReminderEffect.NavigateBack -> navigateBack()
            }
        }
    }

    WaterReminderScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun WaterReminderScreen(
    viewState: WaterReminderState,
    onViewEvent: (WaterReminderEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .statusBarsPadding()
            .systemBarsPadding()
            .padding(16.dp),
    ) {

        BackButton(
            onClick = { onViewEvent(WaterReminderEvent.OnBackClicked) }
        )

        Text(
            text = "Su Hatırlatıcısı",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            ),
            modifier = Modifier.padding(top = 18.dp)
        )

        WaterIntakeTracker(
            currentIntake = 800,
            targetIntake = 2000,
            onAdd = {  },
            onRemove = {  },
        )
    }
}

@Composable
fun WaterIntakeTracker(
    currentIntake: Int,
    targetIntake: Int,
    onAdd: () -> Unit,
    onRemove: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.run { spacedBy(16.dp) },
        modifier = Modifier.fillMaxSize().padding(16.dp).padding(top = 48.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(150.dp)
        ) {
            Canvas(modifier = Modifier.size(150.dp)) {
                val strokeWidth = 12.dp.toPx()
                val progressAngle = (currentIntake / targetIntake.toFloat()) * 360f

                drawArc(
                    color = Color(0xFF53A5FF).copy(alpha = 0.2f),
                    startAngle = -90f,
                    sweepAngle = 360f,
                    useCenter = false,
                    style = Stroke(width = strokeWidth)
                )

                drawArc(
                    color = Color(0xFF53A5FF),
                    startAngle = -90f,
                    sweepAngle = progressAngle,
                    useCenter = false,
                    style = Stroke(width = strokeWidth)
                )
            }
            Text(
                text = "$currentIntake ml",
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp
                ),
            )

            Text(
                text = "\n/ $targetIntake ml",
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 12.sp
                ),
                modifier = Modifier.padding(top = 16.dp)
            )
        }

        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), modifier = Modifier.padding(top = 16.dp)) {
            Image(
                painter = painterResource(R.drawable.ic_minus),
                contentDescription = "Decrease",
                modifier = Modifier.size(28.dp)
                    .clickable { onRemove() },
            )

            Image(
                painter = painterResource(R.drawable.ic_plus),
                contentDescription = "Decrease",
                modifier = Modifier.size(28.dp)
                    .clickable { onAdd() },
            )


        }

        Text(
            text = "Her 250ml için + butonuna basın",
            textAlign = TextAlign.Center,
            color = Color.Gray
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun WaterReminderScreenPreview() {
    WaterReminderScreen(
        viewState = WaterReminderState(),
        onViewEvent = { }
    )
}

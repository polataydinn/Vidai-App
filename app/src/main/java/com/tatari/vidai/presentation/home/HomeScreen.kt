package com.tatari.vidai.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.tatari.vidai.R
import com.tatari.vidai.ui.drawables.IcStart


@Composable
fun HomeRoute(
    navigateToLogin: () -> Unit,
    navigateToWaterReminder: () -> Unit,
    navigateToCalorieCalculator: () -> Unit,
    navigateToIdealWeight: () -> Unit,
    navigateToBMRCalculator: () -> Unit,
    navigateToWeightTracker: () -> Unit,
    navigateToFavorites: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                HomeEffect.NavigateToLogin -> navigateToLogin()
                HomeEffect.NavigateToBMRCalculator -> navigateToBMRCalculator()
                HomeEffect.NavigateToCalorieCalculator -> navigateToCalorieCalculator()
                HomeEffect.NavigateToFavorites -> navigateToFavorites()
                HomeEffect.NavigateToIdealWeight -> navigateToIdealWeight()
                HomeEffect.NavigateToWaterReminder -> navigateToWaterReminder()
                HomeEffect.NavigateToWeightTracker -> navigateToWeightTracker()
            }
        }
    }

    HomeScreen(
        viewState = viewState, onViewEvent = viewModel::setEvent
    )

}

@Composable
fun HomeScreen(
    viewState: HomeState, onViewEvent: (HomeEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .systemBarsPadding()
            .padding(top = 16.dp)
            .padding(horizontal = 16.dp),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = Icons.IcStart,
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(64.dp)
                    .background(Color.Gray, shape = RoundedCornerShape(50))
            )
            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = viewState.user?.fullName.orEmpty(),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier
                    .width(16.dp)
                    .weight(1f)
            )
            Column {
                Text(text = "${viewState.user?.weight.orEmpty()} kg", fontSize = 16.sp, color = Color.Gray)
                Text(text = "${viewState.user?.height.orEmpty()} cm", fontSize = 16.sp, color = Color.Gray)
            }
        }

        val actions = listOf(
            QuickAction(
                title = "Su Hatırlatıcı",
                icon = painterResource(R.drawable.ic_water),
                backgroundColor = Color(0xFFE7F2FF),
                type = QuickEvents.WATER_REMINDER
            ),
            QuickAction(
                title = "Kalori Hedefi",
                icon = painterResource(R.drawable.ic_calori_goal),
                backgroundColor = Color(0xFFFFEFEE),
                type = QuickEvents.CALORIE_GOAL
            ),
            QuickAction(
                title = "İdeal Kilo",
                icon = painterResource(R.drawable.ic_ideal_weight),
                backgroundColor = Color(0xFFE3F9FF),
                type = QuickEvents.IDEAL_WEIGHT
            ),
            QuickAction(
                title = "BMR Hesaplaması",
                icon = painterResource(R.drawable.ic_bmr_calculator),
                backgroundColor = Color(0xFFFFF1D8),
                type = QuickEvents.BMR_CALCULATOR
            ),
            QuickAction(
                title = "Kilo Takibi",
                icon = painterResource(R.drawable.ic_weight_tracker),
                backgroundColor = Color(0xFFF1EDFF),
                type = QuickEvents.WEIGHT_TRACKER
            ),
            QuickAction(
                title = "Favoriler",
                icon = painterResource(R.drawable.ic_favorites),
                backgroundColor = Color(0xFFDFFFE6),
                type = QuickEvents.FAVORITES
            ),
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
        ) {
            item(span = { GridItemSpan(2) }) {
                Image(
                    painter = painterResource(R.drawable.ic_banner),
                    contentDescription = "Banner",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(top = 16.dp),
                )
            }
            items(actions.size) {
                QuickActionItem(
                    title = actions[it].title,
                    iconRes = actions[it].icon,
                    color = actions[it].backgroundColor,
                    quickEvents = actions[it].type,
                    onItemClick = { type -> onViewEvent(HomeEvent.OnQuickActionsClicked(type)) }
                )
            }

            item {
                Text(
                    text = "Diyet Listesi",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 24.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
                    ),
                    modifier = Modifier.padding(top = 16.dp, start = 8.dp)
                )
            }
            items(viewState.dietList?.size ?: 0, span = { GridItemSpan(2) }) {
                DietListItem(
                    modifier = Modifier,
                    title = viewState.dietList?.getOrNull(it)?.title.orEmpty(),
                    description = viewState.dietList?.getOrNull(it)?.shortDescription.orEmpty()
                )
            }
        }

    }
}

@Composable
fun QuickActionItem(
    title: String,
    iconRes: Painter,
    color: Color,
    quickEvents: QuickEvents,
    onItemClick: (QuickEvents) -> Unit = {}
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(8.dp)
            .background(
                color = color, shape = RoundedCornerShape(8.dp)
            )
            .padding(4.dp)
            .clickable {
                onItemClick(quickEvents)
            }
    ) {
        Image(
            painter = iconRes,
            contentDescription = title,
            modifier = Modifier
                .size(48.dp)
                .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
                .padding(4.dp),
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = title,
            style = TextStyle(
                color = Color.Black,
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            ),
        )
    }
}

@Composable
fun DietListItem(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
) {

    Row(
        modifier = modifier
            .padding(8.dp)
            .background(
                color = Color.White, shape = RoundedCornerShape(8.dp)
            )
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.ic_diet_list),
            contentDescription = title,
            modifier = Modifier
                .size(48.dp)
                .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
                .padding(4.dp),
        )

        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = title,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
                ),
            )

            Text(
                text = description,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                ),
            )
        }
    }
}

data class QuickAction(
    val title: String,
    val icon: Painter,
    val backgroundColor: Color,
    val type: QuickEvents
)

enum class QuickEvents {
    WATER_REMINDER,
    CALORIE_GOAL,
    IDEAL_WEIGHT,
    BMR_CALCULATOR,
    WEIGHT_TRACKER,
    FAVORITES
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(viewState = HomeState(), onViewEvent = {})

}
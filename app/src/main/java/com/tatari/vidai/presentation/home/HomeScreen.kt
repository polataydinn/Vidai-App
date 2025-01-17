package com.tatari.vidai.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.furkandogan.doganlarkuyumculuk.ui.drawables.Icwater
import com.tatari.vidai.R
import com.tatari.vidai.ui.drawables.IcStart


@Composable
fun HomeRoute(
    navigateToLogin: () -> Unit, viewModel: HomeViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                HomeEffect.NavigateToLogin -> navigateToLogin()
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
                text = "Rama Tatari",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier
                    .width(16.dp)
                    .weight(1f)
            )
            Column {
                Text(text = "82 kg", fontSize = 16.sp, color = Color.Gray)
                Text(text = "173 cm", fontSize = 16.sp, color = Color.Gray)
            }
        }

        val actions = listOf(
            QuickAction("Su Hatırlatıcı", painterResource(R.drawable.ic_water), Color(0xFFE7F2FF)),
            QuickAction("Kalori Hedefi", painterResource(R.drawable.ic_calori_goal), Color(0xFFFFEFEE)),
            QuickAction("İdeal Kilo", painterResource(R.drawable.ic_ideal_weight), Color(0xFFE3F9FF)),
            QuickAction("BMR Hesaplaması", painterResource(R.drawable.ic_bmr_calculator), Color(0xFFFFF1D8)),
            QuickAction("Kilo Takibi", painterResource(R.drawable.ic_weight_tracker), Color(0xFFF1EDFF)),
            QuickAction("Favoriler", painterResource(R.drawable.ic_favorites), Color(0xFFDFFFE6)),
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
                    color = actions[it].backgroundColor
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
            items(10, span = { GridItemSpan(2) }) {
                DietListItem(
                    modifier = Modifier,
                    title = "Kış Diyeti",
                    description = "Kış diyeti, soğuk havalarda bağışıklığı güçlen..."
                )
            }
        }

    }
}

@Composable
fun QuickActionItem(title: String, iconRes: Painter, color: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(8.dp)
            .background(
                color = color, shape = RoundedCornerShape(8.dp)
            )
            .padding(4.dp)
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
            .padding(4.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_diet_list),
            contentDescription = title,
            modifier = Modifier
                .size(48.dp)
                .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
                .padding(4.dp),
        )

        Column (
            modifier = Modifier.padding(8.dp)
        ){
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


// Data class for DietPlan
data class DietPlan(val title: String, val description: String)
data class QuickAction(val title: String, val icon: Painter, val backgroundColor: Color)

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewDietAppUI() {
    val sampleDietList = listOf(
        DietPlan("Kış Diyeti", "Kış diyeti, soğuk havalarda bağışıklığı güçlen..."), DietPlan(
            "3 Günde 4.5 Kilo Verdiren Diyet", "3 günde, soğuk havalarda bağışıklığı güçlen..."
        ), DietPlan(
            "3 Günde 1 Kilo Verdiren Diyet", "Kış diyeti, soğuk havalarda bağışıklığı güçlen..."
        )
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(viewState = HomeState(), onViewEvent = {})

}
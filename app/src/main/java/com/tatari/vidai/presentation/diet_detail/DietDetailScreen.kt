package com.tatari.vidai.presentation.diet_detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.tatari.vidai.R
import com.tatari.vidai.data.model.Diet
import com.tatari.vidai.data.model.DietsItem
import com.tatari.vidai.presentation.BackButton

@Composable
fun DietDetailRoute(
    navigateBack: () -> Unit,
    viewModel: DietDetailViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                DietDetailEffect.NavigateBack -> navigateBack()
            }
        }
    }

    DietDetailScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun DietDetailScreen(
    viewState: DietDetailState,
    onViewEvent: (DietDetailEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .systemBarsPadding()
            .statusBarsPadding()
            .padding(16.dp),
    ) {

        BackButton(
            onClick = { onViewEvent(DietDetailEvent.OnBackClicked) },
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 18.dp, bottom = 16.dp)
        ) {
            Text(
                text = viewState.diet?.title.orEmpty(),
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
                ),
                modifier = Modifier
                    .weight(1f)
            )

            Image(
                imageVector = if (viewState.diet?.isFavorite == true) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                contentDescription = "Favorite",
                modifier = Modifier
                    .clickable {
                        onViewEvent(DietDetailEvent.OnFavoriteClicked)
                    }
            )
        }


        LazyVerticalGrid(
            columns = GridCells.Fixed(1),
            verticalArrangement = Arrangement.run { spacedBy(16.dp) },
            ) {
            items(viewState.diet?.dietList?.size ?: 0) { index ->
                DietDayItem(viewState.diet?.dietList?.getOrNull(index))
            }
        }

    }
}

@Composable
fun DietDayItem(
    diet: Diet? = null,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(16.dp)
    ) {
        Text(
            text = diet?.day.toString() + ". Gün",
            style = TextStyle(
                fontSize = 14.sp,
                color = Color.Green,
                fontWeight = FontWeight.Normal
            ),
            modifier = Modifier
                .background(
                    color = Color.Green.copy(0.1f),
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(8.dp)
        )

        Column(
            verticalArrangement = Arrangement.run { spacedBy(16.dp) },
        ) {
            TextItemDiet(
                title = "Kahvaltı",
                description = diet?.breakfast.orEmpty()
            )
            TextItemDiet(
                title = "Ara Öğün",
                description = diet?.snack1.orEmpty()
            )
            TextItemDiet(
                title = "Öğle Yemeği",
                description = diet?.lunch.orEmpty()
            )
            TextItemDiet(
                title = "Ara Öğün",
                description = diet?.snack2.orEmpty()
            )
            TextItemDiet(
                title = "Akşam Yemeği",
                description = diet?.dinner.orEmpty()
            )
        }
    }
}

@Composable
fun TextItemDiet(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(start = 16.dp),
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
        )

        Text(
            text = description,
            style = TextStyle(
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal
            ),
            modifier = Modifier
                .padding(top = 4.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun DietDetailScreenPreview() {
    DietDetailScreen(
        viewState = DietDetailState(),
        onViewEvent = { }
    )
}

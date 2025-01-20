package com.tatari.vidai.presentation.favorites

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tatari.vidai.R
import com.tatari.vidai.data.model.DietsItem
import com.tatari.vidai.presentation.BackButton
import com.tatari.vidai.presentation.home.DietListItem
import com.tatari.vidai.presentation.home.HomeEvent

@Composable
fun FavoritesRoute(
    navigateBack: () -> Unit,
    navigateToDietDetails: () -> Unit,
    viewModel: FavoritesViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                FavoritesEffect.NavigateBack -> navigateBack()
                FavoritesEffect.NavigateToDietDetails -> navigateToDietDetails()
            }
        }
    }

    FavoritesScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun FavoritesScreen(
    viewState: FavoritesState,
    onViewEvent: (FavoritesEvent) -> Unit
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
            onClick = { onViewEvent(FavoritesEvent.OnBackClicked) },
        )

        Text(
            text = "Favoriler",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            ),
            modifier = Modifier.padding(top = 18.dp, bottom = 16.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(1),
            modifier = Modifier.fillMaxSize()
        ) {
            items(viewState.favoriteDiets.size) {
                DietListItem(
                    modifier = Modifier,
                    title = viewState.favoriteDiets.getOrNull(it)?.title.orEmpty(),
                    description = viewState.favoriteDiets.getOrNull(it)?.shortDescription.orEmpty(),
                    onItemClick = { onViewEvent(FavoritesEvent.OnDietItemClicked(viewState.favoriteDiets?.getOrNull(it))) },
                    showFavorite = true,
                )
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun FavoritesScreenPreview() {
    FavoritesScreen(
        viewState = FavoritesState(),
        onViewEvent = { }
    )
}

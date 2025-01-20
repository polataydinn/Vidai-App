package com.tatari.vidai.presentation.banner_detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tatari.vidai.R
import com.tatari.vidai.presentation.BackButton

@Composable
fun BannerDetailRoute(
    navigateBack: () -> Unit,
    viewModel: BannerDetailViewModel = hiltViewModel()
) {
    val viewState by viewModel.state.collectAsState()

    LaunchedEffect(viewModel.effect) {
        viewModel.effect.collect { effect ->
            when (effect) {
                BannerDetailEffect.NavigateBack -> navigateBack()
            }
        }
    }

    BannerDetailScreen(
        viewState = viewState,
        onViewEvent = viewModel::setEvent
    )

}

@Composable
fun BannerDetailScreen(
    viewState: BannerDetailState,
    onViewEvent: (BannerDetailEvent) -> Unit
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
            onClick = { onViewEvent(BannerDetailEvent.OnBackClicked) },
        )

        Image(
            painter = painterResource(id = R.drawable.ic_banner_detail),
            contentDescription = null,
        )

        Text(
            text = "Sağlıklı Beslenme Rehberi",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            ),
            modifier = Modifier.padding(top = 18.dp, bottom = 16.dp)
        )

        Text(
            text = "Sağlıklı Beslenme Rehberi ile yaşamınıza enerji ve denge katın! Günlük öğünlerinizde sebze ve meyvelere mutlaka yer vererek vitamin ve mineralleri doğal yollardan alın. İşlenmiş gıdalardan uzak durup doğal besinleri tercih ederek vücudunuzu zararlı maddelerden koruyun. Bol su içmeyi ihmal etmeyin ve su tüketiminizi düzenli takip ederek hidrasyonunuzu sağlayın. \n" +
                    "\n" +
                    "Güne dengeli bir kahvaltıyla başlayarak metabolizmanızı harekete geçirin. Porsiyon kontrolüne dikkat ederek ihtiyacınız kadar beslenin ve aşırıya kaçmaktan kaçının. Sağlıklı beslenme ile hem bedeninizi hem de zihninizi güçlendirin!",
            style = TextStyle(
                color = Color.Black,
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            ),
            modifier = Modifier.padding(top = 0.dp, bottom = 16.dp)
        )



    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun BannerDetailScreenPreview() {
    BannerDetailScreen(
        viewState = BannerDetailState(),
        onViewEvent = { }
    )
}

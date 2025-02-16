package com.tatari.vidai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.google.android.gms.auth.api.identity.Identity
import com.google.firebase.FirebaseApp
import com.google.gson.Gson
import com.tatari.vidai.common.Session
import com.tatari.vidai.data.model.Diets
import com.tatari.vidai.presentation.auth.GoogleAuthUiClient
import com.tatari.vidai.ui.theme.AppBackground
import com.tatari.vidai.ui.theme.VIDAITheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    val googleAuthUiClient by lazy {
        GoogleAuthUiClient(
            context = applicationContext,
            oneTapClient = Identity.getSignInClient(applicationContext)
        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        enableEdgeToEdge()
        setContent {
            VIDAITheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                        .navigationBarsPadding()
                        .background(AppBackground),
                ) { innerPadding ->
                    VidaiApp()
                }
            }
        }
        readJsonFile()
    }

    private fun readJsonFile() {
        val inputStream = resources.openRawResource(R.raw.diets)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)

        val gson = Gson()
        val diets: Diets = gson.fromJson(json, Diets::class.java)
        Session.diets = diets
        viewModel.insertDiets(diets)
    }
}
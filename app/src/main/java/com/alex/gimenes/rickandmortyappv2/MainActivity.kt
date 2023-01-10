package com.alex.gimenes.rickandmortyappv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.alex.gimenes.rickandmortyappv2.navigation.Navigation
import com.alex.gimenes.rickandmortyappv2.theme.RickAndMortyAppV2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RickAndMortyAppV2Theme {
                Navigation()
            }
        }
    }
}
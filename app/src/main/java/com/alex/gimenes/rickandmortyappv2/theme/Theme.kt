package com.alex.gimenes.rickandmortyappv2.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.alex.gimenes.core_ui.color.*
import com.alex.gimenes.core_ui.shape.Shapes
import com.alex.gimenes.core_ui.type.Typography

private val DarkColorPalette = darkColors(
    primary = Dark_Blue,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Gray_343434
)

private val LightColorPalette = lightColors(
    primary = Baby_Blue,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Pale_Green
)

@Composable
fun RickAndMortyAppV2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
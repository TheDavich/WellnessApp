package com.example.wellness.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColors(
    background = md_theme_dark_background,
    surface = md_theme_dark_surface,
    secondary = md_theme_dark_onSurface
)

private val LightColorScheme = lightColors(
    background = md_theme_light_background,
    surface = md_theme_light_surface,
    secondary = md_theme_light_onSurface,

)

@Composable
fun WellnessTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
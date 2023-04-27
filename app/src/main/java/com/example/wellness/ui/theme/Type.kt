package com.example.wellness.ui.theme

import androidx.compose.material.Typography
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.wellness.R

val Montserrat = FontFamily(
    Font(R.font.montserrat_black, FontWeight.Normal),
    Font(R.font.montserrat_semi_bold, FontWeight.SemiBold)
)


// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = Montserrat,
    h1 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp
    )
)
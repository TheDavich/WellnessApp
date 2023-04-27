package com.example.wellness.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    @DrawableRes val icon: Int,
    @StringRes val day: Int,
    @StringRes val description: Int
)
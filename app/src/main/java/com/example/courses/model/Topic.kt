package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @DrawableRes val coverImage: Int,
    @StringRes val topic: Int,
    val courseCount: Int
)

package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val topic: Int,
    val courseCount: Int,
    @DrawableRes val coverImage: Int



)

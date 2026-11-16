package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringSourceId: Int,
    val number: Int,
    @DrawableRes val painterSourceId: Int
)

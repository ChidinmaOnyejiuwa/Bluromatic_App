package com.practice.bluromatic.data

import androidx.annotation.StringRes

data class BlurAmount(
    @StringRes val blurAmountRes: Int,
    val blurAmount: Int
)
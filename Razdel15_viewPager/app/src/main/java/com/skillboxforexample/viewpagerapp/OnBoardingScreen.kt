package com.skillboxforexample.viewpagerapp

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class OnBoardingScreen(
    @StringRes val textRes: Int,
    @ColorRes val bgColor: Int,
    @DrawableRes val drawableRes:Int
) {

}
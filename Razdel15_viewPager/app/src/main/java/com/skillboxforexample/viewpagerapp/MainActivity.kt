package com.skillboxforexample.viewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skillboxforexample.viewpagerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val screens:List<OnBoardingScreen> = listOf(
        OnBoardingScreen(
            textRes = R.string.on_boarding_string_1,
            bgColor = R.color.on_boarding_clor_1,
            drawableRes = R.drawable.on_boarding_image_1),
        OnBoardingScreen(
            textRes = R.string.on_boarding_string_2,
            bgColor = R.color.on_boarding_clor_2,
            drawableRes = R.drawable.on_boarding_image_2),
        OnBoardingScreen(
            textRes = R.string.on_boarding_string_3,
            bgColor = R.color.on_boarding_clor_3,
            drawableRes = R.drawable.on_boarding_image_3),
        OnBoardingScreen(
            textRes = R.string.on_boarding_string_4,
            bgColor = R.color.on_boarding_clor_4,
            drawableRes = R.drawable.on_boarding_image_4),
        OnBoardingScreen(
            textRes = R.string.on_boarding_string_5,
            bgColor = R.color.on_boarding_clor_5,
            drawableRes = R.drawable.on_boarding_image_5)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val adapter = OnBoardingAdapter(screens,this)
        binding.viewPager.adapter =adapter
    }
}
package com.skillboxforexample.viewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.skillboxforexample.viewpagerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val tag = "MainActivity"
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
        binding = ActivityMainBinding.bind(findViewById(R.id.general_view))
        val adapter = OnBoardingAdapter(screens,this)
        binding.viewPager.adapter =adapter
        binding.viewPager.offscreenPageLimit = 1 // в случае, если в соседних окнах грузится что то тяжелое
                                                 // предсоздает соседние экраны
        binding.viewPager.setCurrentItem(2,false) // перелистывание на стр2 мгновенно так как false

        binding.viewPager.currentItem // возвращает текущую позицию
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL // направление скрола или вертикал
        // действие на смену экрана
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                toast("Selected page: $position")
            }
        })
        binding.viewPager.setPageTransformer(object : ViewPager2.PageTransformer{
            override fun transformPage(page: View, position: Float) {
                when{
                    position < -1 || position >1 -> {
                        page.alpha = 0f} // полностью прозрачная страница
                    position <= 0 ->  {
                        page.alpha = 1 + position // плавное изменение прозрачности
                    }
                    position <= 1 ->  {
                        page.alpha = 1 - position
                    }
                }
            }

        })
    }


    fun toast(message:String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
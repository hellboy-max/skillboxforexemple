package com.skillboxforexample.viewpagerapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayoutMediator
import com.skillboxforexample.viewpagerapp.databinding.ActivityTabsBinding

class TabsActivity:AppCompatActivity(R.layout.activity_tabs) {
    private lateinit var binding: ActivityTabsBinding
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
        binding = ActivityTabsBinding.bind(findViewById(R.id.general_vew_tabs))
        val adapter = OnBoardingAdapter(screens+screens,this)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout,binding.viewPager){
            tab, position -> tab.text = "Tab ${position+1}"
            if(position %2 ==0) {
                tab.setIcon(R.drawable.ic_android)
            }
        }.attach()

        binding.tabLayout.getTabAt(1)?.orCreateBadge?.apply {
            number = 2
            badgeGravity = BadgeDrawable.TOP_END // расположение
        } // бэйдж на второй вкладке
        /// после входа на вкладку нужноудалить бэйдж
        binding.viewPager.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.tabLayout.getTabAt(position)?.removeBadge()
            }
        })

    }
}
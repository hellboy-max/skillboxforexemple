package com.skillboxforexample.viewpagerapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnBoardingAdapter(
    private val screens:List<OnBoardingScreen>,
    activity:FragmentActivity):FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return screens.size
    }

    override fun createFragment(position: Int): Fragment {
        val screen:OnBoardingScreen = screens[position]
        return OnBoardingFragment.newInstance(screen.textRes,screen.bgColor,screen.drawableRes)
    }
}
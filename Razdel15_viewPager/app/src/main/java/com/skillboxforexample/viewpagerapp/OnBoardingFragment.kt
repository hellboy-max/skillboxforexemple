package com.skillboxforexample.viewpagerapp

import android.os.Bundle
import android.view.View
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.skillboxforexample.viewpagerapp.databinding.FragmentOnboardingBinding

class OnBoardingFragment:Fragment(R.layout.fragment_onboarding) {

    private lateinit var binding: FragmentOnboardingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOnboardingBinding.bind(view)
        view.setBackgroundResource(requireArguments().getInt(KEY_COLOR))
        binding.imageView.setImageResource(requireArguments().getInt(KEY_IMAGE))
        binding.textView.setText(requireArguments().getInt(KEY_TEXT))
    }

    companion object{
        private val KEY_TEXT ="keytext"
        private val KEY_COLOR ="keytcolor"
        private val KEY_IMAGE ="keyimage"
        fun newInstance(
            @StringRes textRes: Int,
            @ColorRes bgColor: Int,
            @DrawableRes drawableRes:Int):OnBoardingFragment {

            return OnBoardingFragment().withArguments {
                putInt(KEY_TEXT,textRes)
                putInt(KEY_COLOR,bgColor)
                putInt(KEY_IMAGE,drawableRes)
            }
        }

    }
}
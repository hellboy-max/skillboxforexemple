package com.skillboxforexemple.razdel13_2_intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.course_activity.*

class CourseActivity:AppCompatActivity(R.layout.course_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handleIntentData()
    }

    private fun handleIntentData() {
            intent.data?.lastPathSegment.let {courseName->
                courseNameTextView.text = courseName
            }
    }
}
package com.skillboxforexemple.razdel13_2_intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_email.*

class EmailActivity : AppCompatActivity(R.layout.activity_email) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SetEmailParamsFromIntent()
    }

    fun SetEmailParamsFromIntent() {
        val addresses = intent.getStringArrayExtra(Intent.EXTRA_EMAIL)
        val subject = intent.getStringExtra(Intent.EXTRA_SUBJECT)

        addressTextView.text = addresses?.joinToString() ?: "Email address is not set"
        subjectTextView.text = subject ?: "Subject is not set"
    }
}
package com.skillboxforexemple.razdel104

import android.os.Bundle
//import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//import kotlin.random.Random

class Dynamic_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinamic)

        val addButton = findViewById<Button>(R.id.add_button)
        val dinamycEditTextt = findViewById<EditText>(R.id.inputText)
        val container = findViewById<LinearLayout>(R.id.container)
        val textView1 = findViewById<TextView>(R.id.textView)
        val deleteButton = findViewById<Button>(R.id.deleteButton)
        val view = layoutInflater.inflate(R.layout.item_text, container, false)
        addButton.setOnClickListener {
            val texToAdd = dinamycEditTextt.text.toString()
//            val textViewToAdd = TextView(this).apply {
//                text = texToAdd
//                layoutParams =  LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
//                ).apply {
//                   gravity =  when(Random.nextInt(3)) {
//                        0-> Gravity.CENTER
//                        1-> Gravity.END
//                        else -> Gravity.START
//                    }
//                }
//            }
//          container.addView(textViewToAdd)
            view.apply {
                textView1.text = texToAdd
                deleteButton.setOnClickListener {
                    container.removeView(this)
                }
            }
            container.addView(view)
        }

    }
}
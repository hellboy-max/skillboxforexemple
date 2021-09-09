package com.skillboxforexemple.constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            group.isVisible = !group.isVisible
        }

        group.referencedIds.forEach {id->
            findViewById<View>(id).setOnClickListener {
Toast.makeText(this,"clicked on View $id in Group",Toast.LENGTH_SHORT).show()
            }
        }
    }

}
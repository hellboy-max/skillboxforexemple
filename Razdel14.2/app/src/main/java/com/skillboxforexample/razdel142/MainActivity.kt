package com.skillboxforexample.razdel142

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragmentButton.setOnClickListener {
            showInfoFragment()
        }
        replaceFragmentButton.setOnClickListener {
            replaceFragment()
        }
    }

    private fun showInfoFragment() {

        val alreadyHasFragment = supportFragmentManager.findFragmentById(R.id.container) != null
        if (!alreadyHasFragment) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, InfoFragment.newInstance(dataEditText.text.toString()))
                .commit()
        } else {
            toast("Fragment already created")
        }

    }

    fun replaceFragment(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, InfoFragment.newInstance(dataEditText.text.toString()))
            .commit()
    }

    private fun toast(message:String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
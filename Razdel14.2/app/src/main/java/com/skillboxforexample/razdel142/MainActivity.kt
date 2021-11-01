package com.skillboxforexample.razdel142

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val tag = "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragmentButton.setOnClickListener {
            showInfoFragment()
        }
        replaceFragmentButton.setOnClickListener {
            replaceFragment()
        }
        Log.d(tag,"MainActivity onCreate: ${hashCode()}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag,"MainActivity onStart: ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"MainActivity onResume: ${hashCode()}")
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(tag,"MainActivity onRestoreInstanceState: ${hashCode()}")
    }
    override fun onPause() {
        super.onPause()
        Log.d(tag,"MainActivity onPause: ${hashCode()}")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(tag,"MainActivity onSaveInstantState: ${hashCode()}")
    }
    override fun onStop() {
        super.onStop()
        Log.d(tag,"MainActivity onStop: ${hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"MainActivity onDestroy: ${hashCode()}")
        if (!supportFragmentManager.isStateSaved)
            showInfoFragment()
    }
    private fun showInfoFragment() {

        val alreadyHasFragment = supportFragmentManager.findFragmentById(R.id.container) != null
        //if (!alreadyHasFragment) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, InfoFragment.newInstance(dataEditText.text.toString()))
                //.commit()
                .commitAllowingStateLoss() // не добавит если фрагмент менеджер уже сохранил состояние
       // } else {
            //toast("Fragment already created")
       // }

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
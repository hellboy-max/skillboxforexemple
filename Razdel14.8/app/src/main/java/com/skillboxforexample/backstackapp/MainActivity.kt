package com.skillboxforexample.backstackapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
                .add(R.id.container, InfoFragment.newInstance("text1"))
            if (needToBackStack()) {
                transaction.addToBackStack(getStateName())
            }
            transaction.commit()
        }
        buttonReplace.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, InfoFragment.newInstance("text2"))
                .apply {
                    if (needToBackStack()) addToBackStack(getStateName())
                }
                .commit()
        }
        popBackStack.setOnClickListener {
            val stateName:String? = getStateName()
            if (stateName != null)
                supportFragmentManager.popBackStack(stateName,0)
                else supportFragmentManager.popBackStack()
        }
        checkBox.setOnCheckedChangeListener {_,isChecked ->
            stateNameInput.visibility = if (isChecked) View.VISIBLE else View.GONE

        }

    }

    private fun needToBackStack(): Boolean {
        return checkBox.isChecked
    }

    private fun getStateName(): String? {
        return stateNameInput.text.toString().trim().takeIf { it.isNotBlank() }
    }

}
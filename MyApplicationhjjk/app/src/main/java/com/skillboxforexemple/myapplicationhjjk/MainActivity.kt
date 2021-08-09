package com.skillboxforexemple.myapplicationhjjk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//1        textView.text = """
//            Build type = ${BuildConfig.BUILD_TYPE}
//            Flavor = ${BuildConfig.FLAVOR}
//            VersionCode = ${BuildConfig.VERSION_CODE}
//            VersionName = ${BuildConfig.VERSION_NAME}
//        """
// 2       val textView = findViewById<TextView>(R.id.textView)
//        val count =4
//        val pluralString:String = resources.getQuantityString(R.plurals.main_quantity_string,count,count)
//        textView.text = pluralString

    }
}
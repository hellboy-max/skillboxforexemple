package com.skillboxforexemmple.lesson122

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"
    private var state:CounterState = CounterState(0,"")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) { // если есть onRestoreSaveInstanceState
            state = savedInstanceState.getParcelable<CounterState>(KEY_COUNTER) ?: error("Unexpected state")
        }
// 1.       if (BuildConfig.DEBUG) {  // скрываем логирование, если сборка дебажная то логируем если другие то нет
//            Log.d(tag, "On Create was Called")
//        }
        buttonIncrease.setOnClickListener {
            state.increment().also { state = it }
            updateCurrentText()
        }
        buttonDecrease.setOnClickListener {
            state = state.decrement()
            updateCurrentText()
        }
        updateCurrentText()
        DebugLogger.d(tag,"On Create was Called ${hashCode()}")
        //Thread.sleep(5000)
//        buttonIncrease.setOnClickListener{
//            Thread.sleep(5000)
//        }
//        buttonIncrease.setOnClickListener{
//            Thread.sleep(10000)
//        }
        //2 ой способ
        // 3ий способ еще есть библиоека timber - не включает логи в релизные сборки
//        Log.println(Log.VERBOSE, tag, "On Create was Called")
//        Log.v(tag,"On Create was Called") // verbose
//        Log.d(tag, "On Create was Called")
//        Log.println(Log.INFO, tag, "On Create was Called")
//        Log.println(Log.ERROR, tag, "On Create was Called")
//        Log.println(Log.ASSERT, tag, "On Create was Called") //только такая конструкция с assert
     //   error("test crash") // скрашивание приложения
//        countertextView.setOnClickListener {
//            finish()
//        }

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }
    override fun onStart() {
        super.onStart()
        DebugLogger.d(tag,"On Start was Called ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        DebugLogger.d(tag,"On Resume was Called ${hashCode()}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(KEY_COUNTER,state)
    }

    override fun onPause() {
        super.onPause()
        DebugLogger.d(tag,"On Pause was Called ${hashCode()}")
    }

    override fun onTopResumedActivityChanged(isTopResumedActivity: Boolean) {
        super.onTopResumedActivityChanged(isTopResumedActivity)
        DebugLogger.d(tag,"On TopResumedActivityChanged was Called ${hashCode()} = $isTopResumedActivity")
    }

//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        state = savedInstanceState.getInt(KEY_COUNTER)
//        updateCurrentText()
//    }
    override fun onStop() {
        super.onStop()
        DebugLogger.d(tag,"On Stop was Called ${hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        DebugLogger.d(tag,"On Destroy was Called ${hashCode()}")
    }
    private  fun updateCurrentText() {
        countertextView.text = state.counter.toString()
    }
 companion object {
     private val KEY_COUNTER = "counter"
 }

}
object DebugLogger {
    fun d(tag:String, message: String) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, message)
        }
    }
}
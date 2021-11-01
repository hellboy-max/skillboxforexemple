package com.skillboxforexample.razdel142

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.children
import androidx.fragment.app.Fragment

class ListFragment: Fragment(R.layout.fragment_list) {

    private val itemSelectListener:ItemSelectListener?
        get() = activity?.let { it as? ItemSelectListener }
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//
//    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    view.let { it as ViewGroup }
    .children
    .mapNotNull {
        it as? Button }
    .forEach {button ->
        button.setOnClickListener {
            onButtonClick(button.text.toString())
        }
    }

   }

    override fun onDetach() {
        super.onDetach()
    }

    private fun onButtonClick(buttonText:String) {
        Log.d("ListFragment","onButtonClick =$buttonText")
        itemSelectListener?.onItemSelected(buttonText)
        //activity as InteractionActivity не позволит переиспользовать в др активити нужен интерфейс
    }
}
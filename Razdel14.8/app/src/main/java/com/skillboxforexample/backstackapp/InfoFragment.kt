package com.skillboxforexample.backstackapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_info.*

class InfoFragment:Fragment(R.layout.fragment_info) {
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inputTextView.text  = requireArguments().getString(KEY_TEXT)
    }

    companion object {
        private const val KEY_TEXT = "key text"

        fun newInstance(text:String): InfoFragment {
            return InfoFragment().withArguments {
                putString(KEY_TEXT, text)
            }
        }
    }
}
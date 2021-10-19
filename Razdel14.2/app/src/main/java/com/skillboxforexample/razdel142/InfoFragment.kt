package com.skillboxforexample.razdel142

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_info.*

class InfoFragment : Fragment(R.layout.fragment_info) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        inputTextView.text  = requireArguments().getString(KEY_TEXT)
    }

    companion object {
        private const val KEY_TEXT = "key text"
//        fun newInstance(text: String): InfoFragment {
//            val fragment = InfoFragment()
//            val args = Bundle().apply {
//                putString(KEY_TEXT, text)
//            }
//            fragment.arguments
//            return fragment
//        }

        fun newInstance(text:String): InfoFragment {
            return InfoFragment().withArguments {
                putString(KEY_TEXT, text)
            }
        }
    }
}
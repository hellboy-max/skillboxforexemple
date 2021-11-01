package com.skillboxforexample.razdel142

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_info.*

class InfoFragment : Fragment(R.layout.fragment_info) {
    val tag1 = "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag1,"InfoFragment onCreate: ${hashCode()}")
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(tag1,"InfoFragment onAttach: ${hashCode()}")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(tag1,"InfoFragment onCreateView: ${hashCode()}")
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inputTextView.text  = requireArguments().getString(KEY_TEXT)
        Log.d(tag1,"InfoFragment onViewCreated: ${hashCode()}")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(tag1,"InfoFragment onViewStateRestored: ${hashCode()}")
    }
    override fun onStart() {
        super.onStart()
        Log.d(tag1,"InfoFragment onStart: ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag1,"InfoFragment onResume: ${hashCode()}")
    }
    override fun onPause() {
        super.onPause()
        Log.d(tag1,"InfoFragment onPause: ${hashCode()}")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(tag1,"InfoFragment onSaveInstanceState: ${hashCode()}")
    }
    override fun onStop() {
        super.onStop()
        Log.d(tag1,"InfoFragment onStop: ${hashCode()}")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(tag1,"InfoFragment onDestroyView: ${hashCode()}")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag1,"InfoFragment onDestroy: ${hashCode()}")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(tag1,"InfoFragment onDetach: ${hashCode()}")
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
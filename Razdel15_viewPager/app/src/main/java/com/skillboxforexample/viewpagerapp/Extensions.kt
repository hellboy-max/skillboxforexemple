package com.skillboxforexample.viewpagerapp

import android.os.Bundle
import androidx.fragment.app.Fragment

fun <T:Fragment> T.withArguments (actoin:Bundle.()-> Unit):T {
    return apply {
        arguments = Bundle().apply(actoin)
    }
}
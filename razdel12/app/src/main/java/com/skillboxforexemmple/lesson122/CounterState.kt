package com.skillboxforexemmple.lesson122

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CounterState (
    val counter:Int,
    val message: String):Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().orEmpty()
    ) {
    }

    fun increment(): CounterState {
        return copy(counter = counter +1)
    }
    fun decrement(): CounterState {
        return copy(counter = counter -1)
    }

}
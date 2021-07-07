package com.skillboxforexemple.myapplication

data class User (
val name: String,
val lastName:String,
val age: Int = 0
        ){

        fun getFullNameLength() = "$name$lastName".length
}

package com.hellboy.nasled_class

import java.util.*

enum class Color (
    val hex: String
): Drawable{
    WHITE(hex = "#fff"),  // объекты класса описываются внутри тела
    BLACK(hex = "#000"),  // объект типа Color
    RED(hex = "#f00") {
        override fun draw() {
            println("Draw redColor")
        }
    },

    BLUE(hex = "#00f"); // обязатель ; после перечисления

    fun someMethod() {

    }

    override fun draw() {
        println("Draw color")
    }
    companion object {
        fun fromName(name:String): Color? {
        return values().find { it.name == name.uppercase() }
        }
    }
}
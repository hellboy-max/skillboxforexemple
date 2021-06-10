package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.Shape

fun main() {

    val shape = object: Shape {  // можно через запятую еще на втыкать интерфейсов

        val additionalField = 123
        fun additionalFun() = 124

        override val name: String = "Ananymus"
        override fun calculateArea(): Double = 0.0
    }
   println(shape.additionalField)
    println(shape.additionalFun())



}
package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.Rectangle

fun main() {

    listOf(1,2,3) + listOf(3,4,5)
// переопределение + в Rectangle// перегрузка операторов
    val recSum = Rectangle(0,0,10,20) + Rectangle(0,0,20,40)

    val minusRc = -Rectangle(0,0,40,50)

    println(recSum)
    println(minusRc)
}
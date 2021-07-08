package com.skillboxforexemple.homework_8_7

fun main() {

    val k = Wheel()
    println(k.pressure)
    k.setPressure(50.0)
    println("Новое значение pressure: ${k.pressure}")
}
package com.skillboxforexemple.myapplication

import kotlin.math.abs

fun main() {
    print("Введите количество чисел N: ")
    val n = readLine()?.toIntOrNull() ?: return println("Вы вели не число!")
    var counter =0
    var positiveNumber =0
    var sum = 0
    var nod:Int? = null
    while (counter<=n-1) {
        print("введите число: ")
        val k: Int = readLine()?.toIntOrNull() ?: continue
        if (k>0) positiveNumber++
        // nod = if (nod != null) nodFunction(nod, k) else k
        nod = nod?.let { nodFunction(it, k) } ?: k
        sum +=k
        counter++
    }
    println("Количество введенных положительных чисел: $positiveNumber")
    println("Сумма числе = $sum")
    println("общий делитель = $nod")
}

fun nodFunction(a:Int, b:Int): Int {
    if (b == 0)
        return abs(a)
    return nodFunction(b, a % b)
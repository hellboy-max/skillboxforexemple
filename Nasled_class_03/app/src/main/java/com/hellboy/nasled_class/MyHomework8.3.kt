package com.hellboy.nasled_class

import java.math.BigDecimal
import kotlin.math.pow

fun main() {

    val a = listOf<Number>(1, 2,-4,10,5.2,5.3,6.8,-2)
    println(listFilter(a))
}

fun <T:Number> listFilter(random: List<T>): List<Number> {

    val evenList = emptyList<Number>().toMutableList()
    val realList= emptyList<Number>().toMutableList()
    val integerList = emptyList<Number>().toMutableList()

    for (i in random.indices) {
        if (random[i] is Int) {
            integerList.add(random[i])
            if (random[i].toInt() % 2 == 0) evenList.add(random[i])
        }
        // если имелось ввиду выведение делящихся на 2 и чисел с плавающей точкой
        /*if (random[i] is Double) {
            var double = random[i].toDouble()
            val col = BigDecimal.valueOf(double).scale()
            double *= 10.0.pow(col)
            if (double %2 == 0.0) evenList.add(random[i])
        }*/
        if (random[i] is Double) {
            realList.add(random[i])
        }
    }
    println(integerList)
    println(realList)
    return evenList
}


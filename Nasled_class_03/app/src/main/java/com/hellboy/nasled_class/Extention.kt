package com.hellboy.nasled_class

fun main() {
    println(1.toBoolean())
    println(2.isPositive)
    val nulabelInt:Int? = null
    nulabelInt.orDefolt(0)

}

private fun Int.toBoolean(): Boolean {  // будет виден только в этом файле
    return this !=0
}

val Int.isPositive: Boolean
    get() = this >0

private fun Int?.orDefolt(default: Int = 0): Int {
    return this ?: default
}
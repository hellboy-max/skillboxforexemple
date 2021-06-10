package com.hellboy.classesandinheritance

open class Room constructor(area:Double) {

    val area: Double = area
    protected open val title:String = "Обычная комната"
    protected open var isWindows:Boolean = true
    protected open var numberWindows: Int = 4
    fun getDescription() {
        println("""Наименвоание комнаты: $title, 
                  |Площадь комнаты: $area м^2""".trimMargin())

    }
    fun setWindows() {
        if (isWindows) {
           println("Количество окон: $numberWindows")
           isWindows = false
        } else println("Эта комната без окон")
    }
}
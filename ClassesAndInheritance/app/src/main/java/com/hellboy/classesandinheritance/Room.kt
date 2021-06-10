package com.hellboy.classesandinheritance

open class Room(area:Double) {

    val area: Double = area
    protected open val title:String = "Обычная комната"

    fun getDescription() {
        println("Наименвоание комнаты: $title, Площадь комнаты: $area м^2")

    }
}
package com.hellboy.classesandinheritance

class LivingRoom(area:Double, override var numberWindows: Int = 5):Room(area) {
    override val title: String = "Гостинная"
    override var isWindows: Boolean = true
}
package com.hellboy.classesandinheritance

class Bedroom(area:Double, override var numberWindows: Int = 1) : Room(area) {
    override val title: String = "Спальня"
    override var isWindows: Boolean = true

}
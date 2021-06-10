package com.hellboy.classesandinheritance

class Kitchen (area:Double, override var numberWindows: Int = 1):Room(area){
    override val title: String = "Кухня"
    override var isWindows: Boolean = true
}
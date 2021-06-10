package com.hellboy.classesandinheritance

class KidsRoom(area:Double, override var numberWindows: Int = 2): Room(area) {

    public override var title: String = "Детская комната"
    override var isWindows: Boolean = true

}
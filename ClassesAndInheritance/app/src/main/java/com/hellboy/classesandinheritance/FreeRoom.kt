package com.hellboy.classesandinheritance

open class FreeRoom(
    area: Double,
    override var title: String = "Комната свободного назначения",
    override var numberWindows: Int = 4
): Room(area) {
     override var isWindows: Boolean = true

    fun changeName (title: String) { // доп функция смена имени в экземпляре FreeRoom
        this.title=title
        println("Комната свободного назначения теперь называется: ${this.title}")
    }

}
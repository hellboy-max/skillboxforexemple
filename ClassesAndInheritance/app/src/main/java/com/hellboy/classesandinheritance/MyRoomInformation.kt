package com.hellboy.classesandinheritance

fun main() {

   // val singleRoom = Room(50.0)
    // println(singleRoom.getDescription())

    listOf<Room>(
        Room(50.0),
        BathRoom(6.0),
        Bedroom(20.0),
        Kitchen(12.0),
        LivingRoom(40.0),
        KidsRoom(20.0),
        FreeRoom(area = 20.0, title = "Спортзал", numberWindows = 2), // rename FreeRoom
        FreeRoom(20.0) // значение title по умолчанию
    ).forEach { with(it) {
        getDescription()
        setWindows()} }

    print("У этой комнаты пора поменять название. Введите название: ")
    readLine()?.let { FreeRoom(20.0).changeName(it) } // повторение мать учения:)
                                                           // проверил работу функцию
    val renameKidsRoom = KidsRoom(30.0)               // создал экземпляр класса переименовал
    renameKidsRoom.title = "Сауна"
    println("Детская комната теперь: ${renameKidsRoom.title}")
}
package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.Car

fun main() {

    val car = Car(wheelCount = 2, doorCount = 2,200)
    car.openDoor()
    car.setDriver(User("Ivan","Ivanov")) // инициализация водителя
    car.closeDoor()
}
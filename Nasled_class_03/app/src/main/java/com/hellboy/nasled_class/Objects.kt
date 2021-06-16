package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.Car
import com.hellboy.nasled_class.oop.Vehicle

fun main() {

    Cars.nissan
    Cars.someMethod()
    Cars.acselerate(200)
    Car.default
    Car.createWithDefaultWheelCount(doorCount = 4,200)

    val a = Car
    val b = Cars
}

private object Cars : Vehicle(200){  // private - использование только в этом файле
    val  toyota = Car(4,2,200)
    val  nissan = Car(4,2,200)
    fun someMethod() {}
}
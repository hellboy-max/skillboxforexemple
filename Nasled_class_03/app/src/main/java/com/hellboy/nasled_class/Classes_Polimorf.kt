package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.AirPlane
import com.hellboy.nasled_class.oop.Car
import com.hellboy.nasled_class.oop.Vehicle

fun main() {

//    val vehicle: Vehicle = Car(4,2,300)
//    println(vehicle.getTitle())

    // Полиморфизм

    listOf<Vehicle>(
        Vehicle(100),
        AirPlane(300),
        Car(4,2,300)
    ).forEach{
        println(it.getTitle())               // переопределение методов работает таким
                                             // образом в этом и проявляется полиморфизм
                                             // этоработает также для интерфейсов и абстрактных классов
    }

}
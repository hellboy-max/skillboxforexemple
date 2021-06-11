package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.Car

fun main(){

    val car1 = Car(4,2,200)
    val car2 = Car(4,2,200)
    val car3 = car1

    println("Car1 equals to Car2 by ref : ${car1===car2} ")
    println("Car1 equals to Car2 by ref : ${car1===car3} ")
}
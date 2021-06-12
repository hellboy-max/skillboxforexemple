package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.Car

fun main(){

    val car1 = Car(2, 200,200)
    val car2 = Car(2, 200,200)
    val car3 = car1

    println("Car1 equals to Car2 by ref : ${car1===car2} ")
    println("Car1 equals to Car3 by ref : ${car1===car3} ")
    println("Car1 equals to Car2 by ref : ${car1==car2} ")
    println("Все получилось")
    val cars = listOf(
        car1,
        Car(2, 2, 200),
        Car(1, 2,200)
    )
    println(cars.contains(Car(3, 100,200))) // сравнение объекта проходит

    val map = hashMapOf(
        car1 to "1",
        car2 to "2", // новый с одинаковым ключем переписывает предидущий
        Car(100, 2,200) to "3"
    )                                                               // через переопределенный метод
      println(map[Car(2, 200,200)])       //  equals по значению
}
package com.hellboy.class_object

import com.hellboy.class_object.oop.Car


fun main() {
    val tesla = Car(
        wheelCount = 4, doorCount = 2, bodyLenght = 500, bodyWidght = 200, bodyHeight = 150 // см
    )
    println("Скорость tesla = ${tesla.currentSpeed}" )
    tesla.acselerate(100)
    println("Скорость tesla после ускорения= ${tesla.currentSpeed}" )
    //tesla.currentSpeed = 234
    tesla.decelerate(50)
    println("Скорость tesla после торможения = ${tesla.currentSpeed}" )
    println("объем топлива = ${tesla.fuelCount}" )
    //println("Скорость tesla после торможения = ${tesla.fuelCount}" )

//    println("Количество колес: ${tesla.wheelCount}")
//    println("Количество дверей: ${tesla.doorCount}")
//    println("Скорость автомобиля: ${tesla.currentSpeed}")
//    println("Длина автомобиля: ${tesla.bodyLenght} см")
//    println("Ширина автомобиля: ${tesla.bodyWidght} см")
//    println("Высотоа автомобиля: ${tesla.bodyHeight} см")
//    tesla.currentSpeed = 125
//    println("Скорость автомобиля = ${tesla.currentSpeed}")
//
//   // val nissan = Car(doorCount = 2) // остальное останется поумолчснию
//   val nissan = Car(4,2,Triple(500,200,150))
 // c использованием дополнительного конструктора // чтобы использовать triple
 // надо воспользоваться его конструктормо







}
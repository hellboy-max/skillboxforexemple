package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.AbstractShape
import com.hellboy.nasled_class.oop.Rectangle

fun main() {

    // val shape = AbstractShape(100,200) // создать напрямую
    //нельзя нужно создать класс наследник Rectangle
   // print("Введите высоту прямоугольника: ")
    //val shape = readLine()?.let { Rectangle(x = 100, y = 200, widht = 2,it.toInt()) }
    val shape = Rectangle(x = 100, y = 200, widht = 2, height = 2)
    shape.printPosition()
    shape.moveToPosition(200,300)
    shape.printPosition()

    println("Shape area = ${shape.calculateArea()}")
    println("Shape name = ${shape.name}")

    val largeRectangle = Rectangle(100,200,20,40)
    println("shape <=largeRectangle = : ${shape <= largeRectangle}")

    val set:MutableSet<Rectangle> = sortedSetOf(
        shape,
        largeRectangle
    )
    println(set)  // нужно в Rectangle переопределить toString из класса Any

}
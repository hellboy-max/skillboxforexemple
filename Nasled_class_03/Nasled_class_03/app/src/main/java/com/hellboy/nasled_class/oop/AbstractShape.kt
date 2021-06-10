package com.hellboy.nasled_class.oop

abstract class AbstractShape( // не нужно указывать модификатор open
                              // так как автоматически все наследуется
    private var x: Int,
    private var y: Int
): Shape {   // наследование от интерфейса Shape
             // оди н класс может реализовать множество интерфейсов

    //abstract val name: String // можно не инициализировать
    // если есть интерфейс можно не указывать

    //abstract fun calculateArea(): Double // можно не писать тело функции
    // если есть интерфейс можно не указывать
    fun moveToPosition(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
    fun printPosition(){
        println("Shape with position: x = $x cm, y = $y cm")
    }

}
package com.hellboy.nasled_class.oop

class Rectangle(
    x: Int,
    y: Int,
    private val widht: Int,
    private val height: Int,
): AbstractShape(x,y), Comparable<Rectangle,> {

    override val name: String  = "rectangle"   // сдесь реализуюца
                                               // методы объявленные в интерфейсе
      // или get() = "rectangle"


    override fun calculateArea(): Double = widht*height.toDouble()

    override fun compareTo(other: Rectangle): Int {
        return (widht+height) - (other.widht+other.height)
    }

    override fun toString(): String {
        return "Rectangle(wight= $widht, height = $height)"
    }
}
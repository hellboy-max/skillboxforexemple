package com.hellboy.nasled_class.oop

import com.hellboy.nasled_class.PrintAreaOnChangeDelegate

class Rectangle(
    x: Int,
    y: Int,
    widht: Int,
    height: Int,
): AbstractShape(x,y), Comparable<Rectangle,> {

     var widht: Int by PrintAreaOnChangeDelegate(widht)  // для использования свойства должны быть публичными
     var height: Int by PrintAreaOnChangeDelegate(height)  // указанный ранее параметр дает
    // возможность сдесь менять свойства Int. double ...


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
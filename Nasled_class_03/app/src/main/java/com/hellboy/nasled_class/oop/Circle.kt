package com.hellboy.nasled_class.oop

import com.hellboy.nasled_class.PrintAreaOnChangeDelegate

class Circle(
    radius: Int
): Shape {


    override val name: String = "Circle"


    override fun calculateArea(): Double {
        return Math.PI*radius*radius
    }

    var radius by PrintAreaOnChangeDelegate(radius)
}
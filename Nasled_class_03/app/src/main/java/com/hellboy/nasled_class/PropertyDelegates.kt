package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.Car
import com.hellboy.nasled_class.oop.Circle
import com.hellboy.nasled_class.oop.Rectangle
import com.hellboy.nasled_class.oop.Shape
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {

    val rectangle = Rectangle(1,2,20,40)
    rectangle.widht = 40
    rectangle.height = 50

    val circle =Circle(5)
    circle.radius = 10

    val car = Car(4,2,200)
    car.openDoor()
    car.closeDoor()
    car.acselerate(100) // только сдесь создается engeen


}

class PrintAreaOnChangeDelegate<T> (
        private var value: T// сдесь будет храниться свойство
        // для которого и применяется делегат
        ): ReadWriteProperty<Shape, T>  // от интерфейса которое можно читать и записывать
{
    override fun getValue(thisRef: Shape, property: KProperty<*>): T = value
    // когда будем обращаться к свойству оно будет
    // возвращать свое внутреннее состояние



    override fun setValue(thisRef: Shape, property: KProperty<*>, value: T) {
        println("Перед изменением свойств ${property.name} Площадь = ${thisRef.calculateArea()}")
        this.value = value
        println("После изменения свойств ${property.name} Площадь= ${thisRef.calculateArea()}")
    }
}

package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.Car
import com.hellboy.nasled_class.oop.Vehicle

fun main() {

    val tesla = Car(doorCount = 2, maxSpeed = 150, wheelCount = 200)

//
//    tesla.refFuel(100)   - 1 вариант
//    tesla.openDoor()
//    tesla.closeDoor()
//    tesla.acselerate(100)
//    tesla.decelerate(50)

// Упрощаем через скобдт функцию With

       with(tesla) {
            refFuel(100)   //- 2 вариант
            openDoor()
            //closeDoor()
            acselerate(100)
            acselerate(100, true)
            decelerate(50)
       }                                           //  tesla.toString() // наследуемые из класса Any

         val vehicle: Vehicle = tesla // можно так определятьобъекты

        //var vehicle: Vehicle = Vehicle(120) // будет ошибка !!  объекты дочернего класса могут
//                                        выступать в ккачестве объектов родительского но не наоборот
//      tesla.let {
//          it.refFuel(100)   //- 3 вариант let и with могут возвращать значения
//          it.openDoor()
//          it.closeDoor()
//          it.acselerate(100)
//          it.decelerate(50)
//      }
    //val a = tesla.let { 123 }  // тоесть а будет принимать значение 123 типа Int
       //val vehicle = Vehicle(100)
      // vehicle.acselerate(100)
      println("Vehicle  car is =  ${(vehicle is Car)}") // является ли vhicle объектом класса Car ?

      val newCar: Car = vehicle as Car  // преобразование/ приведение типов если все ок то выполнится след код
      newCar.closeDoor()   // принудительное приведение через нулабельный тип ошшибка вернет NULL
      // closeDoor() не стработает потому что дочерний невозможно привести к одителю если
      // без вопроса то будет ошиба

}
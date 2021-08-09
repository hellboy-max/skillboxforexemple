package com.skillboxforexemple.homework_8_7

open class Wheel {
    var pressure: Double = 0.0
        private set

    fun setPressure(value: Double) {
        pressure = value
        if (pressure > 10 || pressure < 0) {
            //pressure = 70.0
            println(IncorrectPressure().inc())
            //println(pressure)
        }


    }

    class TooHighPressure : Wheel() {

    }

    class TooLowPressure : Wheel()
    class IncorrectPressure : Wheel() {
        fun inc(): String {
            return "tgn"
        }

    }


}

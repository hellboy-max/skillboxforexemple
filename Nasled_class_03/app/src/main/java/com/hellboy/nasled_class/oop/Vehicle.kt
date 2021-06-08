package com.hellboy.nasled_class.oop

open class Vehicle (
    val maxSpeed: Int
        ) {
    var currentSpeed: Int = 0
        get() {
            println("current speed get")
            return  field
        }
        private set(value) {
            println("current speed set $value")
            field = value
        }
    var fuelCount: Int= 0
        //private set
         protected set // можем установить fuelCount из класса
                       // наследника но из других мест будет недоступна

   open fun acselerate (speed: Int) { // open (модификатор) для того чтобы можно было
                                      // переопределить/модефицировать логику в car
        val needFuel = speed/2
        if (fuelCount >= needFuel ) {
            currentSpeed += speed
            useFuel(needFuel)} else
            println("Ускорение невозможно")

    }
    fun decelerate (speed: Int) {
        currentSpeed = maxOf(0, currentSpeed-speed)
    }
    open protected fun useFuel(fuelCount:Int) { // если protected то можно использовать в
                                                // наследнике и переопределять open
                                                // (private fun useFuel(fuelCount:Int))
        this.fuelCount -= fuelCount
    }
    fun refFuel(fuelCount:Int) {
        if (currentSpeed==0) {
            this.fuelCount += fuelCount
        } else println("Заправка невозможна")


    }
}
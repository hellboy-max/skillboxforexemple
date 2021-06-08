package com.hellboy.class_object.oop

class Car constructor(  // конструктор не имеет тела. Если собираемся
                        // делать что то при создании объекта класса то нужно объявить блок Init
    val wheelCount: Int,
    val doorCount: Int,
    val bodyLenght: Int ,
    val bodyWidght: Int ,
    val bodyHeight: Int // свойства класса передаваемые в конструктор
   // anotherParam: Int    // не является свойством - и нельзя использовать в других методах класса
){
//init {
//    println("Car Init")
//    //anotherParam сдесь этот параметр будетдоступен
//
//}
     var currentSpeed: Int = 0
        get() {
           println("current speed get")
            return  field // поле хранит значение т.е свойство хранит значение
                          // этот механизм называется backing field для обращения к значению поля
                           // через field
        }
        private set(value) {
            println("current speed set $value")
            field = value
        }
    var fuelCount: Int= 0  // тогда сдесь private можно убрать // означает что мы можем обращаться к
                               // fuelCount для чтения но не можем для установки
        private set
   /*
область видимости get такая же как и поля - можно не указывать , у set она может быть уже
val isStoped: Boolean
//  get() = currentSpeed ==0  // 1 вариант
get() {
return currentSpeed ==0   // второй вариант
}
передача параметров в основной конструктор через this
constructor(wheelCount: Int, doorCount: Int, Bodyize: Triple <Int, Int, Int>): this (wheelCount,
doorCount, Bodyize.first, Bodyize.second, Bodyize.third) {
// дополнительный конструктор может иметь телло и выполнять каке нибудь действия
println("Car secondary constructor")
}
*/
   fun acselerate (speed: Int) {
      val needFuel = speed/2
      if (fuelCount >= needFuel ) {
     currentSpeed += speed
      useFuel(needFuel)} else
          println("Ускорение невозможно")

 }
    fun decelerate (speed: Int) {
        currentSpeed = maxOf(0, currentSpeed-speed)
    }
   private fun useFuel(fuelCount:Int) {
       this.fuelCount -= fuelCount
   }
    fun refFuel(fuelCount:Int) {
        if (currentSpeed==0) {
            this.fuelCount += fuelCount // обращениек свойству самого класса
        } else println("Заправка невозможна")
      // val fuelCount = 50 обращение к переданному параметру в функции

    }
}
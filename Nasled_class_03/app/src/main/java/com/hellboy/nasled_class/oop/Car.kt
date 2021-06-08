package com.hellboy.nasled_class.oop

class Car (
    val wheelCount: Int,  // добавляем основные свойства
    val doorCount: Int,
    maxSpeed: Int
): Vehicle(maxSpeed) {
    var isDoorOpen: Boolean = false
        private set
fun openDoor() {
    if (!isDoorOpen) println("Дверь открыта")
    isDoorOpen = true
    }
fun closeDoor() {
        if (isDoorOpen) println("Дверь закрыта")
        isDoorOpen = false
    //fuelCount = 120 // если в родителе set - область видимости protected
}

     override fun acselerate(speed: Int) { // переопределение метода overaiding - Изменение
                                          // метода без изменения асигнатуры тоесть остается
                                          // название функции и входящие параметры
        if (isDoorOpen) {
            println("невозможно ехать с открытой дверью")
        }
         else {
             super.acselerate(speed)
         }
         //useFuel(23) // если open protrcted в родителе то можо использовать тут
    }

    override fun useFuel(fuelCount: Int) {
        super.useFuel(fuelCount)
    }
    fun acselerate(speed: Int, force: Boolean) {   // перегрузка функции
        if (force) {
            if (isDoorOpen) println("Внимание дверь открыта")
            super.acselerate(speed)
        }else {
           acselerate(speed) // будет вызвана
        }
    }
}                      // если ничего не передается то есть нет основного
                                             // конструктора в родительском классе
                                             // то указываем пустые скрбки

//class Car : Vehicle {   // если нет основного конструктора в классе
//                        // car то нужно создать дополнительный при этом скобки после Vehicle -
//                        //  можно удалить. Если при этом в Vehicle
//                        // есть в основном конструкторе поля (val maxSpeed: Int), то
//                        // дополнительный конструктора обязан вызвать конструтор супер класса
// constructor(): super (400) {
//                                      // инициализация в несколько этапов
//                                      // сначало инициализируется родитель
// }
//}
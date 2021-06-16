package com.hellboy.nasled_class.oop

import com.hellboy.nasled_class.Engeen
import com.hellboy.nasled_class.User

class Car(
    val wheelCount: Int,
    val doorCount: Int,  // добавляем основные свойства
    maxSpeed: Int
): Vehicle(maxSpeed) {
    operator  fun component1(): Int = wheelCount
    operator  fun component2(): Int = doorCount
    private lateinit var driver: User

    private val engeen by lazy {
        Engeen()
    }

    var isDoorOpen: Boolean = false
        private set
fun openDoor() {
    if (!isDoorOpen) println("Дверь открыта")
    isDoorOpen = true
    }
fun closeDoor() {
        if (isDoorOpen) {
            println("Дверь закрыта")
            if (::driver.isInitialized){  // проверка былоли инициализировано свойство
                println("Driver: $driver") // должны убедиться в что в момент использования
                // свойство будет предварительно инициализировано!!!
            }

        }
        isDoorOpen = false
    //fuelCount = 120 // если в родителе set - область видимости protected
}

     override fun acselerate(speed: Int) { // переопределение метода overaiding - Изменение
                                          // метода без изменения асигнатуры тоесть остается
                                          // название функции и входящие параметры
       engeen.use()  // инициализация перед использованием при помощи lazy
                     // инициализация перед созданием engeen
        if (isDoorOpen) {
            println("невозможно ехать с открытой дверью")
        }
         else {
             super.acselerate(speed)
         }
         //useFuel(23) // если open protrcted в родителе то можо использовать тут
    }

    fun setDriver(driver:User){
        this.driver = driver
    }
    override fun getTitle(): String = "Car" // переопределяем getTitle

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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Car

        if (wheelCount != other.wheelCount) return false
        if (doorCount != other.doorCount) return false
        if (isDoorOpen != other.isDoorOpen) return false

        return true
    }

    override fun hashCode(): Int {
        var result = wheelCount
        result = 31 * result + doorCount
        result = 31 * result + isDoorOpen.hashCode()
        return result
    }
    companion object {
        val default = Car(4,4,200)

        fun createWithDefaultWheelCount (doorCount: Int, maxSpeed: Int): Car{
            return Car (wheelCount = 4,doorCount = 4,200 )
        }
    }  // добавляется в самом конце класса

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
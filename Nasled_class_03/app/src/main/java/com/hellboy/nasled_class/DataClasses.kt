package com.hellboy.nasled_class

import com.hellboy.nasled_class.oop.Car

fun main() {
    val user1 = User("name1","lastName1")
    user1.innerState = "state1"  /// можно делать дубликаты а переменные в теле класса можно изменять
    val user2 = User("name1","lastName1")
    user2.innerState = "state2"
    println(user1==user2)

    val user3 = user1.copy(lastname = "copiedLastName") // свойства которые не определены
    println(" innerState3 = ${user3.innerState}")       // в основном конструкторе не копируются
    println(user1) // печатает имя конструктора и его поля // класс за нас сгенерировал toString()

//    val (name, lastName)= User("Иван", "Иванов")
//    println("name = $name")
//    println("lastName = $lastName")

    val user5= User("Иван", "Иванов")
    val name = user5.component1()
    val lastname = user5.component2()
//    println("name = ${user5.name}")
//    println("lastName = ${user5.lastname}")
    println("name = $name")
    println("lastName = $lastname")

    val users = listOf(
        user1,
        user2,
        user3
    )
    users.forEach { (name, lastname) -> println("$name, $lastname") }

    //val (wheelCount,doorCount) = Car(wheelCount = 4, doorCount = 2, 20 )
    // теперь можно использовать компоненты wheelCount,doorCount

    val map = mapOf(
        1 to "1",
        2 to "2"
    )
    for ((key, value) in map){     // это возможно потому что в mapEntry переопределены компонены
        println("key = $key, value = $value")                           //  component1 и component2

    }


}
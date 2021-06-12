package com.hellboy.nasled_class

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
}
package com.skillboxforexemple.myapplication

fun main() {
    val array = arrayOf("Петр", "Александр", "Василий") + arrayOf("Новый пользователь") // нельзя менять размер массива
    for (user in array) {    // можно изменить значение элемента
        println(user)
    }
    array.forEach { println(it) }
    array.forEachIndexed{index, user-> println("Index= $index, element = $user")}

    val firstElement = array[0]
    val lastElement = array[array.lastIndex]
    array[0] = "Новый Петр"
    array.forEach { println(it) }

    val emptyArray = emptyArray<String>() // пустой массив

    var largeArray = Array (100) {index -> "User $index"}
    largeArray.forEach { println(it) }

}
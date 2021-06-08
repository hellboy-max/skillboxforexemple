package com.skillboxforexemple.myapplication

fun main() {
    val para1 = Pair("key","value")
    val para2 = 1 to 2

    println("first = ${para1.first},second = ${para1.second} ")
    println(para2)

    val map = mapOf(                   /// через функцию mapOff - мапы не мутабельные
        "Name1" to "+789247071171",
        //  "Name1" to "+7892000000", // будет перезаписано этим значением
        "Name2" to "+789247071172",
        "Name3" to "+789247071173"
    )   /// либо .toMutableMap()          либо 3.   // для того чтоб были мутабельными
    println(map["Name1"])
    println(map["Name4"])

    val map2 = mapOf(                    //неправильно - ключи должны быть одного
                                          // типа, значения тоже
        1 to "+789247071171",
        "Name2" to 2


    )
    val mutableType = map.toMutableMap() // 3 - Переводит нашу мап из не изменяемой в изменяемую
    val mutableType2 = mutableMapOf("1" to "2") // функция создает сразу мутабельную мапу
    mutableType["Name1"]  = "0000000000" // в мутабельной мапе можно менять значение по ключу
    mutableType["Name"]  = "0000000011" // добавление
    mutableType.put("Name5", "454545") // добавление
    mutableType.remove("Name2")  // удаление по ключу

    mutableType.toMap()  /// перевод из мутабельной в немутабельную

    // сотрторованные treemap хранит ключи в натуральном порядке
    val sortedTree = sortedMapOf(
        "2" to "22",
        "3" to "33",
        "4" to "44",
        "1" to "11"
    )
    // созданеи hashmap хранит ключи не гарантирует порядок для ключей
    val hashmap = hashMapOf(
        "2" to "22",
        "3" to "33",
        "4" to "44",
        "1" to "11"
    )
  // println(sortedTree)
  //  println(hashmap)
   // доступ к ключам и множеству занчений
  println(hashmap.keys)
  println(hashmap.values)
    // для того чтобы проитеррировать ся по мапе

    for (key in hashmap.keys ) {
        println("key = $key , value = ${hashmap[key]} ") // доступ к значению по ключу
    }
    /// либо
    hashmap.forEach { (key, value) ->
        key
        value
    }


}
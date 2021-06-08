package com.skillboxforexemple.myapplication

fun main() {
   //1/   val immutableArray = listOf("1", "2", "3" ) // не изменяемый список
    val mutableArray = mutableListOf("1", "2", "3" )  //2 изменяемый список
    println(mutableArray)

    mutableArray[0]

    mutableArray.forEach {println(it)}

    var emptyList = emptyList<String>() // создание пустого изменяемого списка

   // immutableArray[0] = "2.1" //  1/ ошибка компиляции

    mutableArray[0] = "2.1"  //2
    println(mutableArray)

    mutableArray.removeAt(0)
    mutableArray.add("4") // добавляем в конец
    mutableArray.add(1, "3")
    println(mutableArray)

    mutableArray.addAll(arrayOf("10","20")) // добавляем элементы из другого списка
    println(mutableArray)

}
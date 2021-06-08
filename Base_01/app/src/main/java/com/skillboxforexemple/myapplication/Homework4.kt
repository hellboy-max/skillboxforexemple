package com.skillboxforexemple.myapplication

import java.util.*  // к функции createMap

fun main() {
    var n: Int? = null // переменная для получения количества номеров
    while (n==null)
    {
        print("Введите количество номеров: ")
        n = readLine()?.toIntOrNull()
        if (n==null) continue
    } // цикл для проверки: ввели число или что то другое или вообще ничего не ввели
    val plusSeven = setNumber(n)  // смарт каст - не разобрался как убрать подсветку n
                                  // записываем в переменную мутабельный список
    println(plusSeven.filter { it.startsWith("+7") }) // перечень номеров с префиксом +7
    val unique = plusSeven.toSortedSet()  /// преобразуем -> множество
    val uniqueSize = unique.size          /// рамер множества
    println(uniqueSize)                   // вывод количества уникальных номеров
                                          // видимо имелось ввиду не повторяющихся
    println("Сумма длин всех номеров телефонов = ${unique.sumOf<String>{ it.length }}")
   // фунция sumBy устарела - так сказать посидел поискал в development
    val finisedBook = createMap(unique, uniqueSize)  // решил перенести созданеи map в отдельную ф.
   // println(finisedBook.keys) просто для проверки
   // println(finisedBook.values)
    for (key in finisedBook.keys ) {
        println("Человек: ${finisedBook[key]}. Номер телефона: $key") // вывыодим в цикле тел.книгу

    }
}

fun setNumber (n:Int): MutableList<String> {
    val mutableList = mutableListOf<String>()
    val range = 0 until n
    for (currentNumber in range) {
        print("Ведите ${currentNumber+1} номер абонента: ")
        mutableList.add(currentNumber, readLine() ?: continue) // не уверен на счет continue
    }
    return mutableList // функция возвращает переменную типа MutableList
}
                       //  SortedSet из Java - можно ли обойтись без импорта Java
fun createMap (listNumbers: SortedSet<String>, size: Int): MutableMap<String,String> {
    val range = 0 until size
    val mutableMapNumber = mutableMapOf<String, String>()
    for (currentNumber in range) {
        print("Ведите имя человека с номером телефона " +
                listNumbers.elementAt(currentNumber)+" ")
        (readLine()?.let { mutableMapNumber.put(listNumbers.elementAt(currentNumber),
            it) }) ?: continue // не уверен на счет continue
    }
    return mutableMapNumber // функция возвращает переменную типа MutableMap с key & value
}

package com.skillboxforexemple.myapplication

fun main() {
    // 1. не изменяемое множество

    val immutableSet = setOf(1, 2, 4, 2, 9, 8) // повторяющихся элементов в итоге
                                              // в списке не будет но порядок останется
    println(immutableSet)

    val un1Set = setOf(1, 2 ,3 ).union(setOf(1,4,5)) // добавит не похожие в конец первого
    println(un1Set)                                  // операция объединения

    val substractSet = setOf(1, 2 ,3 ).subtract(setOf(1,4,5)) // операция вычитания - останется 2,3
    println(substractSet)                                    // вычитает одинаковые

    val intersectSet = setOf(1, 2 ,3 ).intersect(setOf(1,4,5)) // пересечение останется только 1
    println(intersectSet)

    // 2. сортированное множество по натуральному порядку
    val naturalSetOrder = sortedSetOf(1, 4, -5, 4 ,7,3) // выбрасывает одинаковые сортирует
                                                         // по возрастанию не изменяемое множество
    // val naturalSetOrder = sortedSetOf(1, 4, -5, 4 ,7,3).toMutableSet() // изменяемый set

    // println(naturalSetOrder)
    println(naturalSetOrder.descendingSet()) // в обратном порядке

    mutableSetOf(1,2,3).add(34) // можно добавить элемент в Set / функция создания

    /// создаем HashSet

    val hashSet = hashSetOf(1,2,-3)
    hashSet.add(1)
    hashSet.remove(1)

    hashSet.contains(1)  // есть ли элемент в списке
    println(1 in hashSet)           // короткая запись// вернет true еслие сть





}
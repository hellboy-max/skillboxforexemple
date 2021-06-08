package com.skillboxforexemple.myapplication

fun main() {
    print("Введите число: ")
    val n = readLine()?.toIntOrNull() ?: return
    println("Вы ввели: $n")
    println("Сумма с помощью While = ${calculateSumByWhile(n)}")

    //printIventNumbers(n)
    println("Сумма с помощью DoWhile = ${ calculateSumDoWhile(n)}")
    println("Сумма с помощью For = ${ calculateSumFor(n)}")

    printChars()
    printIventNumbersto3(n)


}

fun calculateSumByWhile (n: Int): Long {
    var sum: Long = 0
    var current: Int = 0
    while(current <= n) {
        sum += current
        current++
    }
    return (sum)
}

fun calculateSumByWhileInfinit (n: Int): Long {
    var sum: Long = 0
    var current: Int = 0
    while(true) {
        if(current>n) return sum
        sum += current
        current++
    }
    //return (sum) /// можно удалить если в бесконечном цикле есть
                  // условие для выхода
}

fun calculateSumByWhileBreak (n: Int): Long {
    var sum: Long = 0
    var current: Int = 0
    while(true) {
        if(current>n) break
        sum += current
        current++
    }
    return sum /// еслие сть break
}

fun printIventNumbers (n: Int) { // возвращаемый тип Unit
var currentNumber = 0
   while(currentNumber <= n) {
       var numberBefore = currentNumber
       currentNumber++
       if (numberBefore %2 ==1) continue
       println(numberBefore)
   }

}

fun calculateSumDoWhile (n: Int): Long {
    var sum: Long = 0
    var current: Int = 0
    do {
        sum+= current
        current++

    } while (current <= n)
    return sum
}

fun calculateSumFor (n: Int): Long {
    var sum: Long = 0
    val range = 0..n
    // val range = 0..n-1    //кроме n
    //val range = 0 until n  //кроме n
    for (currentNumber in range) {    // число входящее в диапазон
        sum+= currentNumber
    }
    return sum
}

fun printChars (){
    for (currentCH in "String") {
        println(currentCH)
    }
}


fun printIventNumbersto3 (n: Int) { // возвращаемый тип Unit
    val range = n downTo 0 step 2
    for (currentNumber in range) {
        println(currentNumber)
    }

}


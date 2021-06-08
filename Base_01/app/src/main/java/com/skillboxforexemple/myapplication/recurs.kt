package com.skillboxforexemple.myapplication

fun main() {
    print("Введите число: ")
    val n = readLine()?.toIntOrNull() ?: return
    println("Вы ввели: $n")
    println(calculateSumRecursiv(n))
//}
//fun calculateSumRecursiv (n: Int) : Int {
//    return if (n==0) {
//        0
//} else n+ calculateSumRecursiv(n-1)
//}
}
    tailrec fun calculateSumRecursiv(n: Int, accum: Int = 0): Int { /// хвостовая рекурсия для
                                                                  // того чтобы не было переполнения
        return if (n == 0) {
            accum
        } else {
            calculateSumRecursiv(n - 1, accum + n)
        }
    }


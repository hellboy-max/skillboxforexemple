package com.skillboxforexemple.myapplication

//fun main () {
//  val string: String = "string" // непозволяет налияи нулабельного значчения
//    val nullableString: String? = null
//
//    println(string.length)
//    println(nullableString?.length)
//
//}

//fun main () {
//  val string: String = "string" // непозволяет налияи нулабельного значчения
//  val nullableString: String? = null
//
//  val lenghth: Int =  string.length
//  val nullableLenght: Int? = nullableString?.length
//
//  nullableString?.reversed()
//    ?.find { it == '4' } // найти символ 4 в строке
//    ?.isDigit()  // является ли строка числом
//
//  println("String lenght is ${nullableString?.length ?: "incorrect"}")
//
//}
//fun main () {
//  readLine()?.toIntOrNull()
//    ?.let { rrr ->
//      println("Вы ввели число $rrr ")
//    }
//    ?: println("Вы ввели не число")
//
//}
fun main () {
//  readLine()?.toIntOrNull() /// неявное указание параметра то it
//    ?.let {
//      println("Вы ввели число $it ")
//    }
//    ?: println("Вы ввели не число")

  // printLenghtString(null)
  printLenghtString("asasas")
}

fun printLenghtString (string: String?) {
  // string ?: return  // закоментить ели !! ниже
  println("Длина строки = ${string?.length}")
 // println("Длина строки = ${string!!.length}") // я ирчно знаю что строка не NULL а если NULL то сам виноват

}

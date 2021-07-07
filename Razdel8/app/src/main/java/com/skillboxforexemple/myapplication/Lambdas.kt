package com.skillboxforexemple.myapplication

fun main(){

    val lambda = { x:Int, y: Int -> x+y}
    println(lambda(10,20))
    val lambda2 = { println("text from lambda")}
    lambda2()
    val lambda3 = { x:Int -> println("text from lambda $x")}
    lambda3(10)

}
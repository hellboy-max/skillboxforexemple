package com.skillboxforexemple.myapplication

import java.lang.NullPointerException

fun main() {
    try {
        println("before")
        functionWithException()
        println("after")
    } catch (t: NullPointerException) {
        println("catch NullPointerException with info: ${t.message}")
    } catch (t: Exception) {
        println("catch Exception with info: ${t.message}")
    } catch (t: Throwable) {
        println("catch Throwable with info: ${t.message}")
    } finally {
        println("finaly")                   // В любом случае выполняется
    }
    functionOuter()
}

fun functionOuter() {
    println("functionOuter before")
    functionWithExceptionHandling()
    println("functionOuter after")
}

fun functionWithExceptionHandling() {
    println("functionWithExceptionHandling before")
    try {
        functionInner()
    } catch (t:Throwable) {
        println("catch Throwable with info = ${t.message}")
    }
    println("functionWithExceptionHandling after")
}

fun functionInner() {
    println("functionInner before")
    functionWithException()
    println("functionInner after")
}

fun functionWithException() {
    println("functionWithException before")
    throw Exception("exception with additional info")
    println("functionWithException after")
}
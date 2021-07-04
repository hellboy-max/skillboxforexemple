package com.hellboy.nasled_class

fun main() {

    val c = listOf<Number?>(25,2.2,-5)
    val k = Queue(c)
    k.enqueue(74)
    println(k)
    println(k.dequeue())
}

class Queue<T> (a: List<T>) {
   var b= a.toMutableList()
   fun enqueue(item: T) {
       b.add(item)
   }
    fun dequeue(): T? {
        return b[0]
    }

    override fun toString(): String {
        return "$b"
    }
}
package com.hellboy.classesandinheritance

class BathRoom (area:Double):Room(area){
    override val title: String = "Ванная комната"
    override var isWindows: Boolean = false

}
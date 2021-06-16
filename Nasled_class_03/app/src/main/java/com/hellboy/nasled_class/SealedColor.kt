package com.hellboy.nasled_class

sealed class SealedColor ( // нельзя создать объект сид класса , только наслледников
    val hex: String
        ): Drawable {
    object White: SealedColor ("#fff")  // наследование можно описать ниже не
                                             // обязательно нутри класса
    object Black: SealedColor ("#000") {
        override fun draw() {
            println("draw Black")
        }
    }
class CustomColor(hex: String):SealedColor(hex) {  // в сиод классах можно
                                              // определять наследников класса в отличии от Enum

}

    override fun draw() {
        println("")
    }
}
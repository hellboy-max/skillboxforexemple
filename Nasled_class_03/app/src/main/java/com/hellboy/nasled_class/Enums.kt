package com.hellboy.nasled_class

fun main() {

    val color = Color.BLACK.hex
    Color.RED.draw()
    //Color.BLACK.draw()
Color.values().forEach {
//    it.draw()
//    println(it.name)
    println(it.ordinal) // индекс объекта внктри массива начиная с 0-ого
}

    Color.values()[Color.BLACK.ordinal]
    println(Color.fromName("WHITE"))

    SealedColor.Black
    SealedColor.CustomColor("#333")
}

fun invertColor(color:Color): Color {
    return when (color) {
        Color.WHITE -> Color.BLACK
        Color.BLACK -> Color.WHITE
        Color.RED -> Color.BLUE
        Color.BLUE -> Color.RED
    }
}
    fun invertColor2(color:SealedColor): SealedColor {
        return when(color) {
            SealedColor.Black -> SealedColor.White
            SealedColor.White -> SealedColor.Black
            is SealedColor.CustomColor -> {
                SealedColor.White
            }
        }
}
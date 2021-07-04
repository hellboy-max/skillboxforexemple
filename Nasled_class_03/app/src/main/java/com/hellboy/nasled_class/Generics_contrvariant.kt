package com.hellboy.nasled_class

fun main() {

    val genericObject =  GenericLClass1<Double>(0.0)
    val genericObject3 =  GenericLClass1<Float>(0f)
    val genericObject4 =  GenericLClass1<Float>(0f)
    //genericObject.updateItem(2.3)

    val genericObject2 =  GenericLClass1<Double>(0.0)
    // genericObject.updateItem(2.3)

    println(sumGeneric(genericObject,genericObject2))
    println(sumGeneric(genericObject3,genericObject4))


    //printGenericObject<String?>("data")

}

//class GenericLClass<T, R> (defaultValue:T) {
//    var item: T? = defaultValue
//    private set
//
//    fun updateItem(newItem:T,returnItem:R):R {
//        item=newItem
//        return returnItem
//    }
//}

class GenericLClass1<out T: Number > (defaultValue:T) {
    private var item: T = defaultValue

    fun getItem():T {
        return item
    }

//    fun updateItem(newItem:T) {
//        item=newItem
//       // item?.toFloat()
//       // item?.toInt()
//    }
}

fun sumGeneric(a:GenericLClass1<Number>,b:GenericLClass1<Number>): Int {

    return a.getItem().toInt() + b.getItem().toInt()
}

fun <T> printGenericObject1(item:T){
    println(item.toString())
}
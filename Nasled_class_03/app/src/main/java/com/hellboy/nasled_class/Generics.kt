package com.hellboy.nasled_class

fun main() {
//
//    val genericObject =  GenericLClass<Double>(0.0)
//    val genericObject3 =  GenericLClass<Float>(0f)
//    val genericObject4 =  GenericLClass<Float>(0f)
//    //genericObject.updateItem(2.3)
//
//    val genericObject2 =  GenericLClass<Double>(0.0)
//   // genericObject.updateItem(2.3)
//
//    println(sumGeneric(genericObject,genericObject2))
//    println(sumGeneric(genericObject3,genericObject4))
//
//    updateContrVariant(ContrVariantClass<Any>(234))
//
//    //printGenericObject<String?>("data")
//
}
//
////class GenericLClass<T, R> (defaultValue:T) {
////    var item: T? = defaultValue
////    private set
////
////    fun updateItem(newItem:T,returnItem:R):R {
////        item=newItem
////        return returnItem
////    }
////}
//
//class GenericLClass<out T: Number,in R > (defaultValue:T) {
//    private var item: T = defaultValue
//
//    fun getItem():T {
//      return item
//    }
//
//    fun setItem(newR:R) {
//
//    }
//
////    fun updateItem(newItem:T) {
////        item=newItem
////       // item?.toFloat()
////       // item?.toInt()
////    }
//}
//
//class ContrVariantClass<in T> (defaultValue: T) {
//private var item:T = defaultValue
//
//    fun setItem(newItem:T){
//        item=newItem
//
//    }
//}
//
//fun updateContrVariant(input: ContrVariantClass<Number>) {
//    input.setItem(2.2)
//
//}
//fun sumGeneric(a:GenericLClass<Number>,b:GenericLClass<Number>): Int {
//
//    return a.getItem().toInt() + b.getItem().toInt()
//}
//
//fun <T> printGenericObject(item:T){
//    println(item.toString())
//}
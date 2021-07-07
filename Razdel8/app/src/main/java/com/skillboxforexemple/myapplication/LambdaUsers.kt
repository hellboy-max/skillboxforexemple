package com.skillboxforexemple.myapplication

fun main(){
    val users= listOf(
        User("Victor", "Sorokin",20),
        User("Max", "Pupkin",30),
        User("Ivan", "Postulatov",35),
        User("Mariya", "Pohuischtodelova",41)
    )
//    var oldestUser:User? =null
//    for (user in users) {
//        val currentAge = user.age
//        val maxAge = oldestUser?.age ?: Int.MIN_VALUE
//        if (currentAge > maxAge) {
//            oldestUser= user
//        }
//    }
    val user1=users[0]
    val oldestUser = users.maxByOrNull { user -> user.age }
    val oldestUser2 = users.maxByOrNull { user -> user1.age.let { it+1 } }
    val maxNameUser = users.maxByOrNull { it.getFullNameLength() }
    val maxNameUser2 = users.maxByOrNull(User::getFullNameLength)
    println(maxNameUser2)
                             // тип параметров -> возвр тип
    fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
        return emptyList()
    }

    val car = Car(4,2,200) { println("iggi") }
    car.openDoor { println("open door custom") }

    makeCalculation ({
        println("result = $it")},{  })
    // аналогично
    // val value =1+61+1
    // println("result = $value")

}

inline fun makeCalculation(callback:(Int) -> Unit, noinline callback2: (Int) -> Unit) {
    val value =1+61+1
    val value2 = 25+45+89
    callback(value)
    callback2(value2)
}
package ch.keepcalm.kotlin.tutorial

fun main(args: Array<String>) {

    val myAnswer = 42
    val aInt: Int
    var myInt = 199
    val theSameNumber = 123456789
    val anInt = 1
    val aLong: Long = anInt.toLong()

    // Java
    // int lowest = (a < b) ? a : b;
    // Kotlin
    val lowest = if (myInt < anInt) myInt else anInt
    println("The lowset value is $lowest")

    // IF
    val temp = 80
    val isAirConditionerOn = if (temp >= 80) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")


    // WHEN
    val burgersOrdered = 8
    when (burgersOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (burgersOrdered) {
        Math.abs(burgersOrdered) -> println("ordered 0 or more burgers")
        else -> {
            println("Ordered less than 0")
        }
    }

    when (burgersOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Not sure")
    }

    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number ordered")
    }

    // For
    for (item in 1..10){
    //  item++ don't work
        println("Item value is: $item")
    }
    for (ch in "biscuit"){
        println(ch)
    }
}
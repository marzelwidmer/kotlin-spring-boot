package ch.keepcalm.kotlin

val name = "Marcel"

fun main(args: Array<String>) {
    println("Hello $name")


    var num1 = 45.0
    println("The value of num1 is $num1")
    num1++
    println("The new value of num1 is $num1")


    val num2:Double = 5.toDouble()
    println("The value of num2 is $num2")


    val myInt = 42
    val myLong:Long = myInt.toLong()

    println("The type of myLong is ${myLong::class.simpleName}")
    println("The type of myLong is ${myLong::class.simpleName}")

    val myLong2 = 3.64
    var myInt2 = myLong2.toInt()
    println("The value of myLong2 is $myLong2")
    println("The value of myInt2 is $myInt2")

    val myInt3 = 568
    val myDouble = myInt3.toDouble()
    println("The value of myDouble is $myDouble")


}

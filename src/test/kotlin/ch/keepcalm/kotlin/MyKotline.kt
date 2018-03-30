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

    // get type
    val myInt = 42
    val myLong:Long = myInt.toLong()
    println("The type of myLong is ${myLong::class.simpleName}")
    println("The type of myLong is ${myLong::class.qualifiedName}")

    //    downcasting
    val myLong2 = 3.64
    var myInt2 = myLong2.toInt()
    println("The value of myLong2 is $myLong2")
    println("The value of myInt2 is $myInt2")

    //    upcasting
    val myInt3 = 568
    val myDouble = myInt3.toDouble()
    println("The value of myDouble is $myDouble ")



    // Compare numeric values
    val num11 = 15
    val num12 = 10

    val match:Boolean = (num11 == num12)
    println("Match of val is : $match")
//  So from this we learn that using the double equals operator is much more efficient
//    val match2:Boolean = num11.equals(num12)
//    println("Match2 of val is : $match2")

//    comparable
    println("Comparasion result (15:10) = ${num11.compareTo(num12)}")
    println("Comparasion result (10:15)= ${num12.compareTo(num11)}")
    println("Comparasion result (15:15)= ${num11.compareTo(num11)}")


}

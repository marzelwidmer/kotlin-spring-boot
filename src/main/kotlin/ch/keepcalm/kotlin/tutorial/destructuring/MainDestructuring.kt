package ch.keepcalm.kotlin.tutorial.destructuring

import ch.keepcalm.kotlin.tutorial.overloadingOperator.Postition

fun main(args: Array<String>) {
    val p1 = Postition(200, 100)
    println("Postion 1 = $p1")
    val p2 = Postition(1000, 2000)
    println("Postion 2 = $p2")
    val p3 = p1 + p2
    println("Postion 3 = $p3")

    //Destructuring is a way for us to pull just the variables we want from a
    // more complicated object.
    // Let's take a look at the position data class
    // TODO is this like Dozer Mapper ?
    val (xPosition, yPosition) = p1
    println("xPostision = $xPosition, yPosition = $yPosition")
    println("c1 = ${p1.component1()}")

}
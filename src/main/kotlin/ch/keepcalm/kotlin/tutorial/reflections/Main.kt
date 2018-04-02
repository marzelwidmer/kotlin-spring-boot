package ch.keepcalm.kotlin.tutorial

fun main(args: Array<String>) {
    val me = Person("Marcel", "Widmer")
    val kClass = me.javaClass.kotlin
    println("Simple name = ${kClass.simpleName}")
    println("Simple name = ${kClass.qualifiedName}")

    val basco = Dog("Terrier")
    println("My dog is a ${basco.breed}")
}
package ch.keepcalm.kotlin.tutorial

import kotlin.reflect.full.memberProperties

fun main(args: Array<String>) {
    val me = Person("Marcel", "Widmer")
    val basco = Dog("Terrier")
    println("My dog is a ${basco.breed}")


    val kClass = basco.javaClass.kotlin
    println("Simple name = ${kClass.simpleName}")
    println("Qualified name = ${kClass.qualifiedName}")

    for (name in kClass.memberProperties) {
        println("Property name= $name")
    }


}
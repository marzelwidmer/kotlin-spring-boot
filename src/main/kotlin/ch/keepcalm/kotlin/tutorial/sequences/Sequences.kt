package ch.keepcalm.kotlin.tutorial.sequences

import ch.keepcalm.kotlin.tutorial.lambda.getStudents

fun sequences(){
    val students = getStudents()
    val sqStudents = students.drop(1).take(3).toList()
    println("Sequenced Students: ${sqStudents}")



}


fun main(args: Array<String>) {
    sequences()
}
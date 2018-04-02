package ch.keepcalm.kotlin.tutorial

class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Creating a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) : this(firstName, lastName) {
        println("Creating a person named $firstName $middleName $lastName")
    }
}
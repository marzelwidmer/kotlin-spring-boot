package ch.keepcalm.kotlin.dataclass

data class Person (private val firstName: String,
                   private val lastName: String){

    val fullName: String
        get() = "$firstName $lastName"
}
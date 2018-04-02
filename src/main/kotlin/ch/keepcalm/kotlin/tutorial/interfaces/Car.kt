package ch.keepcalm.kotlin.tutorial.interfaces

class Car : Vehicle{

    override val MakeName: String = "Ford"

    override fun getDoors(): Int {
        return 5
    }

}
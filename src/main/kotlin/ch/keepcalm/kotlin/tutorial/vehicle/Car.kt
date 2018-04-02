package ch.keepcalm.kotlin.tutorial.vehicle

class Car : Vehicle{

    override val MakeName: String = "Ford"

    override fun getDoors(): Int {
        return 5
    }

}
package ch.keepcalm.kotlin.dataclass

fun main(args: Array<String>) {

    val clothingItem = ClothingItem("Shirt", "L", 19.95)
    println(clothingItem)

    clothingItem.price = 10.45
    println(clothingItem)

    val clothingItem2 = ClothingItem("M", 2.50)
    println(clothingItem2)
    println("Item type = ${clothingItem2.type}")

    clothingItem2.price = 10.0
    println("ClothingItme 2 price is included 10% discount : ${clothingItem2.price}")

    val person = Person("Marcel", "Widmer")
    println("That person is ${person.fullName}")
}
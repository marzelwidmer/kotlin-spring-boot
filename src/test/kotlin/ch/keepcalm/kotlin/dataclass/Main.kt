package ch.keepcalm.kotlin.dataclass

fun main(args: Array<String>) {

    val clothingItem = ClothingItem("Shirt", "L", 19.95)
    println(clothingItem)

    clothingItem.price = 10.45
    println(clothingItem)

    val clothingItem2 = ClothingItem("M", 2.50)
    println(clothingItem2)


}

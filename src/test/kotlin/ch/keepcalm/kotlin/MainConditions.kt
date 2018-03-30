package ch.keepcalm.kotlin

fun main(args: Array<String>) {
    println("Enter a state abbreviation: ")
    val state = readLine()

//    if (state == "CA")println("The capital is Sacremento")
//    else if (state == "OR") println("The capital is Salem")
//    else println("I don`t know that sate")

//    val capital: String?
//    when (state) {
//        "CA" -> capital = "Sacramento"
//        "OR" -> capital = "Salem"
//        else -> capital = "Unknown"
//    }


    val capital = when (state) {
        "CA" -> "Sacramento"
        "OR" -> "Salem"
        else ->  "Unknown"
    }
    println("The capital is $capital")

    when (state){
        "CA", "OR", "WA" -> println("West Coast")
        "NH", "VT", "MA" -> println("New England")
        else -> println("Somewhere else")
    }
}

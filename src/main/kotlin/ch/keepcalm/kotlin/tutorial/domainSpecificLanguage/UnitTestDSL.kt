package ch.keepcalm.kotlin.tutorial.domainSpecificLanguage

fun main(args: Array<String>) {
    unitTest()
}
fun unitTest(){
    val listOfNames = listOf("April", "May", "June")
    listOfNames should { notContain("Portia")}

    val listOfNamesWithPortia = listOf("April", "May", "June", "Portia")
    listOfNamesWithPortia should { notContain("Portia")}
}

package assignment_june_13

fun main() {
    val colors = setOf("Red", "Green", "Blue")
    val toCheck = "Green"
    if (toCheck in colors) {
        println("$toCheck exists in the set.")
    } else {
        println("$toCheck not found.")
    }
}
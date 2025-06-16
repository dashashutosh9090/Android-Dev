package assignment_june_13

fun main() {
    val numberStr = "abc"
    try {
        val number = numberStr.toInt()
        println("Converted number: $number")
    } catch (e: NumberFormatException) {
        println("Invalid number format: ${e.message}")
    }
}
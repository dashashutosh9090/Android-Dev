package assignment_june_13

fun main() {
    val numbers = (1..5).toList()
    val factorial = numbers.reduce { acc, num -> acc * num }
    println("Factorial: $factorial")
}
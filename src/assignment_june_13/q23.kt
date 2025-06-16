package assignment_june_13

fun main() {
    val age = -5
    if (age < 0) {
        throw IllegalArgumentException("Age cannot be negative")
    }
    println("Age: $age")
}
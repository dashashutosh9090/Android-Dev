package assignment_june_13

fun main() {
    try {
        checkAge(15)
    } catch (e: InvalidAgeException) {
        println("Exception: ${e.message}")
    }
}

class InvalidAgeException(message: String) : Exception(message)

fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be at least 18")
    }
    println("Age is valid: $age")
}
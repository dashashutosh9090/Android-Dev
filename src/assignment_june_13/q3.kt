package assignment_june_13

fun main() {
    val employees = mapOf("Alice" to "HR", "Bob" to "IT", "Charlie" to "Finance")
    for ((name, dept) in employees) {
        println("$name -> $dept")
    }
}
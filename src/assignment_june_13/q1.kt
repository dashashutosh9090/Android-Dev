package assignment_june_13

fun main() {
    val numbers = (1..20).toList()
    for (num in numbers) {
        if (num % 2 == 0) {
            println(num)
        }
    }
}
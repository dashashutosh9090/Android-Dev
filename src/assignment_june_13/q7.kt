package assignment_june_13

fun main() {
    val items = mapOf("Laptop" to 700, "Mouse" to 150, "Monitor" to 550)
    for ((item, price) in items) {
        if (price > 500) {
            println("$item: ₹$price")
        }
    }
}
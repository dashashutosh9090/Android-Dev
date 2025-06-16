package assignment_june_13

fun main() {
    val items = listOf("Pen", "Book", "Laptop")
    items.forEachIndexed { index, item ->
        println("$index: $item")
    }
}
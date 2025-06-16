package assignment_june_13

fun main() {
    val fruits = mutableListOf("Mango", "Apple", "Melon", "Banana", "Pear")
    val iterator = fruits.iterator()
    while (iterator.hasNext()) {
        if (iterator.next().startsWith("M")) {
            iterator.remove()
        }
    }
    println(fruits)
}
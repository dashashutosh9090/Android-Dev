package assignment_june_13

fun main() {
    val list = listOf(1, 2, 3)
    try {
        println(list[5])
    } catch (e: IndexOutOfBoundsException) {
        println("Index out of bounds: ${e.message}")
    } finally {
        println("End of operation")
    }
}
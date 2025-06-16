package assignment_june_13

fun main() {
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(3, 4, 5, 6)
    val merged = (list1 + list2).toSet()
    println(merged)
}
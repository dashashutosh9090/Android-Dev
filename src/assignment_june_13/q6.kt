package assignment_june_13

fun main() {
    val words = listOf("Kotlin", "Code", "Practice")
    val lengths = mutableListOf<Int>()
    for (word in words) {
        lengths.add(word.length)
    }
    println(lengths)
}
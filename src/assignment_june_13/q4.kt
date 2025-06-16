package assignment_june_13

fun main() {
    val names = listOf("Ashu", "Priyanka", "Rajat", "Michael", "Sam")
    var count = 0
    for (name in names) {
        if (name.length > 5) {
            count++
        }
    }
    println("Count: $count")
}
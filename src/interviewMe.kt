fun main() {
    val input = listOf(1, 2, 3, 5, 7)
    val missing = mutableListOf<Int>()

    var min = input[0]
    var max = input[input.size - 1]

    for (i in min..max) {
        if (i !in input) {
            missing.add(i)
        }
    }

    println(missing)
}

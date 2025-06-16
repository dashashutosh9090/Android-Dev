package assignment_june_13

fun main() {
    val nums = listOf(1, 2, 3, 6, 7, 2)

    val taken = nums.takeWhile { it < 5 }
    println("takeWhile: $taken") // stops when condition fails

    val dropped = nums.dropWhile { it < 5 }
    println("dropWhile: $dropped") // drops while condition is true, keeps rest
}
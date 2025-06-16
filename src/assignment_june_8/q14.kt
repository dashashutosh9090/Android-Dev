package assignment_june_8

fun main()
{
    fun findMax(numbers: List<Int>?): Int {
        return numbers?.maxOrNull() ?: -1
    }
    println(findMax(listOf(1, 3, 2))) // Output: 3
    println(findMax(null))           // Output: -1
}
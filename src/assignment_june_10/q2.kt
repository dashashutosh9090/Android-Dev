package assignment_june_10

fun main()
{
    fun getLength(input: String?): Int {
        if (input != null) {
            return input.length
        }
        return 0
    }

    println(getLength("Kotlin"))  // Output: 6
    println(getLength(null))      // Output: 0

}
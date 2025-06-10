package assignment_june_8

// 5. Create a list of integers, square each number manually using a loop, and print the result.

fun main()
{
    val numbers = listOf(1,2,3,4,5)
    for (num in numbers)
    {
        println(num * num)
    }
}
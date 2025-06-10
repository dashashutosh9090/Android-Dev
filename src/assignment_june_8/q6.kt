package assignment_june_8

// 6. Write a func on that takes a list of integers and returns the sum of all odd numbers.

fun sumOfOddNum(numbers: List<Int>): Int{
    var sum = 0
    for (num in numbers)
    {
        if(num % 2 != 0)
        {
            sum+=num
        }
    }
    return sum
}

fun main()
{
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    println(sumOfOddNum(numbers))
}
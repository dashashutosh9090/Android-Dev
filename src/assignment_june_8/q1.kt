package assignment_june_8

// 1. Create a list of integers from 1 to 10, filter only the even numbers, and print them.

fun main()
{
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)

//    for (i in numbers)
//    {
//        if (i % 2 == 0)
//        {
//            println(i)
//        }
//    }
    val evenNum = mutableListOf<Int>()

    for(num in numbers)
    {
        if (num % 2 == 0)
        {
            evenNum.add(num)
        }
    }
    println(evenNum)

}
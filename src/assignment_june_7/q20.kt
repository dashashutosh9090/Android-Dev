package assignment_june_7

// 20. Create a program that uses a continue statement to skip printing decaf coffee orders in a
//loop from 1 to 10.

fun main()
{
    for(i in 1..10)
    {
        if (i % 3 == 0) // assuming every 3rd order is decaf
        {
            println("Skipping decaf order #$i")
            continue
        }
        println("Preparing coffee order #$i")
    }
}
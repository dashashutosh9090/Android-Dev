package assignment_june_7

// 7. Write a program that loops through coffee prices from 1 to 10 dollars and prints only
//those divisible by 2.

fun main()
{
    for (price in 1..10)
    {
        if (price % 2 == 0)
            println("Price: $$price")
    }
}
package assignment_june_7

// 12. Create a program that checks if a coffee price is low, medium, or high using a when
//expression and prints a fun message.

fun main()
{
    val price = 60
    val category = when{
        price < 30 -> "Low"
        price in 30..50 -> "Medium"
        else -> "High"
    }
    println("The coffee is in the $category price range.")
}
package assignment_june_7

// 16. Create a program that checks if a coffee order name (string variable) has at least 5
//characters and prints a message.

fun main()
{
    val orderName = "Latte"
    if (orderName.length >= 5)
        println("That's a fancy order name!")
    else
        println("Short & sweet coffee name!")
}
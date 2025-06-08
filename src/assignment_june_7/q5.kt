package assignment_june_7

// 5. Write a program to check if a coffee order number (stored in a variable) is even or odd
//and print a funny message.

fun main()
{
    val orderNumber = 7
    if (orderNumber % 2 == 0)
        println("Order #$orderNumber is even - like your chill vibes.")
    else
        println("Order #$orderNumber id odd - just like your caffeine needs.")
}
package assignment_june_7

// 19. Write a program that breaks out of a loop when the coffee order count reaches 5 and
//prints "Rush hour!" message.

fun main()
{
    for (i in 1..10)
    {
        if (i == 5)
        {
            println("Rush hour!")
            break
        }
        println("Processing order #$i")
    }
}
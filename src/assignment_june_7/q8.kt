package assignment_june_7

// 8. Create a program that uses a for loop to print a countdown of coffee cups from 5 to 1
//with a fun message.

fun main()
{
    for (cups in 5 downTo 1)
    {
        println("$cups cup(s) of coffee left - better hurry!")
    }
}
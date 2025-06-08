package assignment_june_7

// 11. Write a program that uses a while loop to simulate brewing coffee until the strength
//reaches 80, printing each step.

fun main()
{
    var strength = 0
    while(strength < 80)
    {
        println("Brewing... strength at $strength")
        strength +=10
    }
    println("Coffee ready with strength reached: $strength")
}
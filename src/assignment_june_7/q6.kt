package assignment_june_7

// 6. Use a when expression to print a unique coffee recommendation based on a day
//number (1–7).

fun main()
{
    val day = 3
    when(day)
    {
        1 -> println("Start Monday with strong Espresso!")
        2 -> println("Try a creamy Cappuccino for Tuesday!")
        3 -> println("Latte day Wednesday!")
        4 -> println("Mocha Thursday - sweet and strong!")
        5 -> println("Friday? Go with a Macchiato")
        6 -> println("Saturday's perfect for Cold Brew.")
        7 -> println("Sunday calls for a relaxing Flat White")
        else -> println("Not a valid day!")
    }
}
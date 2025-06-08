package assignment_june_7

// 18. Use a when expression to print a funny coffee shop tip based on a random number
//between 1 and 4.

fun main()
{
    val tip = (1..4).random()
    when(tip) {
        1 -> println("Tip: Never trust decaf.")
        2 -> println("Tip: Life happens, coffee helps.")
        3 -> println("Tip: Espresso yourself")
        4 -> println("Tip: Better latte than never")
    }
}
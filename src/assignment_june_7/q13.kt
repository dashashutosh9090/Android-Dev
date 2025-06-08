package assignment_june_7

// 13. Write a program to print a discount table for a coffee (e.g., 10% to 50%) using a for loop.

fun main()
{
    val originalPrice = 10
    for (discount in 10..50 step 10)
    {
        val discountedPrice = originalPrice * (1 - discount/100.0)
        println("$discount% off: $$discountedPrice ☕")
    }
}
package assignment_june_7

// 4. Create a program to swap the values of two variables representing coffee cup sizes
//(e.g., "Small" and "Large").

fun main()
{
    var s = "Small"
    var l = "Large"
    val temp = s
    s = l
    l = temp
    println("Small: $s, Large: $l")
}
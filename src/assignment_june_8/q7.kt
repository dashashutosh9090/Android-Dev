package assignment_june_8

// 7. Write a function that accepts two integers and returns a string like "Sum of X and Y is Z".
fun sum(x: Int,y: Int):String{
    val z = x + y
    return "Sum of $x and $y is $z"
}
fun main()
{
    println(sum(5,10))
}
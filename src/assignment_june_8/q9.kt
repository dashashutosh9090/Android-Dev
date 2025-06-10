package assignment_june_8

// 9. Write a recursive func on to calculate the factorial of a number.

fun fact(n: Int): Int{
    if (n<=1){
        return 1
    }
    else{
        return n*fact(n-1)
    }
}
fun main()
{
    println(fact(5))
}
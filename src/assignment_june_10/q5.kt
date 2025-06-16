package assignment_june_10

fun main()
{
    val anyValue: Any = 21
    val age: Int? = anyValue as? Int
    println(age)
}
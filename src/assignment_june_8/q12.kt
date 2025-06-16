package assignment_june_8

fun main()
{
    val number: Int? = 42
    val message = number?.let { "The value is $it" } ?: "Value is missing"
    println(message)
}
package assignment_june_8

fun main()
{
    val numericString: String? = "123"
    val result = numericString?.toIntOrNull()?.times(2)
    println(result ?: "Invalid number")
}
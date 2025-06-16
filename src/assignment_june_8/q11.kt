package assignment_june_8

fun main()
{
    val name: String? = "Ashutosh"
    if (!name.isNullOrBlank())
    {
        println(name.reversed())
    }
}
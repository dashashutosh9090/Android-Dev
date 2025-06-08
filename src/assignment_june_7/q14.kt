package assignment_june_7

// 14. Use a when expression to categorize a coffee temperature (in Celsius) as "Too Cold",
//"Perfect", or "Too Hot".

fun main()
{
    val temp = 60
    val tempCategory = when{
        temp < 50 -> "Too Cold"
        temp in 50..70 ->"Perfect"
        else -> "Too Hot"
    }
    println("The temperature of the coffee is $tempCategory")
}
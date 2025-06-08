package assignment_june_7

// 10. Use a when expression to assign a coffee strength (Mild, Medium, Strong) based on a
//caffeine level (0–100).

fun main()
{
    val caffeine = 75
    val strength = when {
        caffeine < 30 -> "Mild"
        caffeine in 30..70 -> "Medium"
        caffeine > 70 -> "Strong"
        else -> "Unknown"
    }
    println("Coffee Strength: $strength")
}
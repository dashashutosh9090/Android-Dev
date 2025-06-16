package assignment_june_10

fun main() {
    val circle = Circle(5.0)
    println("Area: ${circle.area()}")
}

abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
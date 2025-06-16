package assignment_june_10

fun main() {
    val car = Car()
    car.drive()
}

interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() {
        println("Car is driving")
    }
}
package assignment_june_10

fun main() {
    val person = Person("Ashutosh", 24)
    println("Name: ${person.name}, Age: ${person.age}")
}

class Person(val name: String, val age: Int)
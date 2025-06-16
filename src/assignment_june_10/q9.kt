package assignment_june_10

class Person2(val name: String, val age: Int) {
    constructor(name: String) : this(name, 18)
}

fun main()
{
    val p1 = Person2("Alice", 25)
    val p2 = Person2("Bob")
    println("P1: ${p1.name}, Age: ${p1.age}")
    println("P2: ${p2.name}, Age: ${p2.age}")
}
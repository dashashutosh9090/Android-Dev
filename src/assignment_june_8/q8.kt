package assignment_june_8

// 8. Write a function with two optional string parameters and return a formatted full name like "First
//Last".

fun name(first: String = "",last: String = ""): String{
    return "$first $last"
}

fun main()
{
    println(name("Ashutosh","Dash"))
    println(name("Ashu"))
}
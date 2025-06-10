package assignment_june_8

// 10. Write a func on that takes a list of strings and returns the longest string in the list.

fun longStr(strings: List<String>):String{
    var long = ""
    for(str in strings)
    {
        if(str.length > long.length)
        {
            long = str
        }
    }
    return long
}
fun main()
{
    val words = listOf("apple","banana","cherry","watermelon")
    println(longStr(words))
}
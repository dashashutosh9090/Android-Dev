package assignment_june_13

fun main() {
    val isPalindrome: (String) -> Boolean = { str ->
        str == str.reversed()
    }
    println(isPalindrome("level"))   // true
    println(isPalindrome("kotlin"))  // false
}
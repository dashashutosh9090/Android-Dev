package assignment_june_10

fun main() {
    val user1 = User("Ashu", "ashu@email.com")
    val user2 = User("Ashu", "ashu@email.com")
    println(user1 == user2)
}

data class User(val name: String, val email: String)
package assignment_june_10

fun main()
{
    val token: String? = "abc123"
    if (token != null) {
        token.run {
            println("Token is valid: $this")
        }
    }
}
package assignment_june_10

fun main() {
    Logger.log("App launched")
}

object Logger {
    fun log(message: String) {
        println("LOG: $message")
    }
}
package assignment_june_13

fun main() {
    val data: String? = null
    val list = listOf(1, 2)

    try {
        val length = data!!.length
        println(list[5])
    } catch (e: NullPointerException) {
        println("Null value error: ${e.message}")
    } catch (e: IndexOutOfBoundsException) {
        println("List index error: ${e.message}")
    }
}
package assignment_june_10

fun main() {
    println(MathUtils.square(6))
}

class MathUtils {
    companion object {
        fun square(n: Int): Int {
            return n * n
        }
    }
}
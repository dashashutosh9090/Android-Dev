package assignment_june_13

fun main() {
    println(operateOnNumbers(4, 2) { a, b -> a + b }) // sum
    println(operateOnNumbers(4, 2) { a, b -> a * b }) // product
    println(operateOnNumbers(4, 2) { a, b -> a - b }) // difference
}

fun operateOnNumbers(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}
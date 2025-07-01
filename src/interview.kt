//Find missing numbers:

//input:[1,2,3,5,7]
//output:[4,6]

fun main() {
    val input = listOf<Int>(1,2,3,5,7)
    val result = findMissingNumber(input)
    println(result)
}

fun findMissingNumber(a:List<Int>):List<Int> {
    val n=a.maxOrNull() ?: 0
    val inputSet=a.toSet()
    val missing = mutableListOf<Int>()
    for (i in 1..n) {
        if (i !in inputSet) {
            missing.add(i)
        }
    }
    return missing
}
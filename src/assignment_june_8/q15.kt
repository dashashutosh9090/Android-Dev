package assignment_june_8

fun main()
{
    val str: String? = "hello"

    // ?. Safe call
    println("Length (safe): ${str?.length}")

    // !! Not-null assertion (throws exception if null)
    println("Length (!!): ${str!!.length}")

    // ?: Elvis operator
    val message = str ?: "String is null"
    println(message)

}
package assignment_june_8

// 4. Given a list of words, count how many words have more than 4 characters.

fun main()
{
    val words = listOf("apple","dog","banana","cat","elephant")
    var count = 0

    for (word in words)
    {
        if(word.length>4)
        {
            count++
        }
    }
    println("Words with more than 4 chars: $count")
}
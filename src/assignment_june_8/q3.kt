package assignment_june_8

// 3. Create a map of student names to their marks. Print the names of students who scored more than
//75.

fun main()
{
    val studentMarks = mapOf("Ashu" to 90,"Alice" to 70,"Rocket" to 83)
    for ((name,marks) in studentMarks)
    {
        if(marks > 75)
        {
            println(name)
        }
    }
}
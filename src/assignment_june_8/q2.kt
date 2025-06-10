package assignment_june_8

// 2. Given a mutable list of names, remove all names that start with the letter 'A'.

fun main()
{
    val names = mutableListOf("Ashu","Alice","Alex","Raj","Chintu")
    val namesToKeep = mutableListOf<String>()
    for (name in names)
    {
        if(!name.startsWith("A"))
        {
            namesToKeep.add(name)
        }
    }
    println(namesToKeep)
//    val iterator = names.iterator()
//    while (iterator.hasNext()) {
//        if (iterator.next().startsWith("A")) {
//            iterator.remove()
//        }
//    }
//
//    println(names)



}
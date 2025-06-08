package assignment_june_7

// 15. Write a program that uses a do-while loop to count down coffee inventory from 10 to 1,
//printing stock updates.

fun main()
{
    var stock = 10
    do {
        println("Coffee inventory: $stock")
        stock--
    }while(stock >= 1)
}
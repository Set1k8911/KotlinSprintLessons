package org.example

fun main() {

    var pfrase = "He said \"it is beautiful\""
    println(pfrase)

    var symbol = """ |fffff
         |bbbbb
       |ccccc
       """.trimMargin()
    println(symbol)
    var symbol2 = """ fffff
         bbbbb
       ccccc
       """.trimIndent()
    println(symbol2)
    println("to which ${40 + 3}")



    var str = "abcd"
    str += str
   println(str)

    val str2 = "a\nb\nc\nd"
println(str2)
    val str3 = "abc"
    print ("${str2.length }")






    val great = "hello"
    val c= ' '
    val d ="Star Lord!"
    println ( great + '!' + c + d)

}

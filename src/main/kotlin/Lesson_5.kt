package org.example

fun main () {


    val userAge = readln().toInt()
val resultText = if (userAge >= AGE_OF_MAJORIT)

"Show special content"
else if (userAge == 16 || userAge == 17)
        "SHow limited content"
    else
        "Back to main menu"
//println(resultText)




    val console = when (userAge) {

        10 -> {println( "Addition action")
            "You number is 10"}
        20 -> "You number is 20"
        42 -> "You nubmer is 42"
        else -> "Another number"}
        println(console)

}

const val AGE_OF_MAJORIT = 18
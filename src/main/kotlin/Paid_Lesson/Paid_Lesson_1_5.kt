package org.example.Paid_Lesson

fun main() {

    val hour = SECOND/(TIME*TIME)
    val minute = (SECOND/TIME)%TIME
    val second = SECOND%SECOND
    println("%02d:%02d:%02d".format(hour, minute, second))
}
 const val TIME = 60
 const val SECOND = 6480
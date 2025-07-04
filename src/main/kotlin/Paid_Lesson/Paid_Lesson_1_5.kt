package org.example.Paid_Lesson

fun main() {

    val hour = 6480/3600
    val minute = (6480/TIME)%60
    val second = 6480%6480


        val hh =(String.format("%02d  %d", hour, minute ))
    val mm =(String.format("%d", minute ))
    val ss =(String.format("%02d", second))


    println("$hh:$mm:$ss")



}
 const val TIME = 60
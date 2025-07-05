package org.example.Paid_Lesson

import kotlin.time.Duration
import kotlin.time.Duration.Companion.minutes

fun main () {
    val startHour = 9
    val startMin = 39
    val start = (startHour*MIN)+startMin
    val startOfMotion: Duration=start.minutes
    val drive: Duration=TOTAL_TIME.minutes
    print("Поезд прибудет в ")
    print( startOfMotion+drive)
}
    const val TOTAL_TIME = 457
    const val MIN = 60

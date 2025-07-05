package org.example.Paid_Lesson
import kotlin.math.truncate

fun main () {


    val ironOre = 7
    val crystallineOre = 11
    var bonusIron = ironOre*UNIT
    var bonusCrystall = crystallineOre*UNIT
    println(truncate(bonusIron))
    println (truncate(bonusCrystall))
}


const val UNIT: Double = 0.2
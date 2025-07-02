package org.example

fun main () {

    val userAge = 45
    val comparisonResult : Boolean = (userAge <= AGE_OF_MAJORITY) && (userAge <= RETIREMENT_AGE)
    println("Result is: $comparisonResult")
    val result = userAge in AGE_OF_MAJORITY .. RETIREMENT_AGE

    val a = 5
    val str ="${a} + abcd"
    println(str)


}
const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65
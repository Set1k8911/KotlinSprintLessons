package org.example

fun main() {
    val intNum1: Int = 20
    val intNum2: Int = 7
    println(intNum1 / intNum2)

    val doubleNum1: Double = 20.0
    val doubleNum2: Double = 7.0
    println(doubleNum1 / doubleNum2)

    val floatNum1: Float = 20.0f
    val floatNum2: Float = 7.0f
    println (floatNum1 / floatNum2)
    //остаток от деления %
    println (10%3)

    //инкремент,декремент
    var counter = 0
    counter +=1
    counter = counter + 1
    counter ++
    println(counter)

    //конечный тип переменной
    val f = intNum1 + floatNum1
    println(f)

    val f1 = intNum1+ floatNum1 + doubleNum1
    println(f1::class.java.simpleName)

    var i= 0
    println (i++)
    println(++i)

    val f2 = intNum2 +doubleNum2
    println (f2)
    
}
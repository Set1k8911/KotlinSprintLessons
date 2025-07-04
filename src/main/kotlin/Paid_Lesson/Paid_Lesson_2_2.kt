package org.example.Paid_Lesson

fun main () {


    val numberOfEmployees = 50
    val trainees = 30
    val salary = 30000
    val traineeSalary = 20000
    val costs = numberOfEmployees * salary
    val totalCosts= (numberOfEmployees + trainees) * (salary +traineeSalary)
    val average = (totalCosts / (numberOfEmployees + trainees))
    println(costs)
    println (totalCosts)
    println (average)

}
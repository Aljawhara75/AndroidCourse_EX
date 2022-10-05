package com.example.kotlinbasics

fun main(){

    var arrayDouble = arrayListOf(5.5,7.8,5.9,9.7 ,9.3)
    var average: Double=0.0

    for (index in 0 until arrayDouble.size){
            average+=arrayDouble[index]
    }
println("The average is ${average/arrayDouble.size}")


}
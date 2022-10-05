package com.example.kotlinbasics.assignments

fun main(){

    calculate(2.3,3.7)

}

fun calculate (number1:Double,number2:Double,string:String="+"){
    when(string){
        "+"-> println(number1+number2)
        "-"-> println(number1-number2)
        "*"->println(number1*number2)
        "/"->println(number1/number2)
        else -> println("wrong String")
    }
}
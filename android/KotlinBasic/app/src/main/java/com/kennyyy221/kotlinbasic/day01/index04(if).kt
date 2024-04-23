package com.kennyyy221.kotlinbasic.day01

fun main(){
    var num = 30
    var grade : String


    //일반적인 if
    if(num >= 90){
        grade = "a"
    }else if(num >= 80){
        grade = "b"
    }else{
        grade = "c"
    }

    //express if
    var result = if(num >= 90){
        "a"
    }else if(num >= 80){
        "b"
    }else{
        "c"
    }
    println(result)
}
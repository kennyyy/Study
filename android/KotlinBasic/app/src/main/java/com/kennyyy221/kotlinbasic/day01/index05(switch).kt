package com.kennyyy221.kotlinbasic.day01

fun main(){
    //자바의 swithch문과 동일
    //코틀린에서는 when구문이 switch를 대신합니다.
    //안드로이드에서 많이 사용됨


    var data : Any = 5;

    when(data){
        1 -> println("1 입니다")
        2 -> println("2 입니다")
        3 -> {
            println("3 입니다")
        }
        4, 5, 6 -> {
            println("4,5,6 입니다")
        }
        else -> {
            println("그외 나머지")
        }
    }

    //express when
    var result = when(data){
        1 -> "1 입니다";
        2 -> {
            "2 입니다"
        };
        3,4 -> "3 또는 4 입니다";
        else -> "그외 나머지"
    }
    println(result)

}


package com.kennyyy221.kotlinbasic.day01

fun main(){
    print("hello world~");

    //변수
    var a = 10; //변경이 가능한 변수
    val b = 20; //변경이 불가능한 변수

    //변수의 타입을 선언, 자동추론
    //var a1 : int = 20//wrapper타입으로 변환
    var a1 : Int = 20
    var a2 : String = "문자열"
    var a3 : Long = 10000L
    var a4 : Double = 3.14
    var a5 : Boolean = true
    var a6 : Any = "어떤 값이든 상관없음"
    var a7 : Any = true

    //타입을 적지 않으면, js처럼 해당 타입을 자동으로 추론해서 지정
    var b1 = 3.14
    println(b1)

    //출력
    print("$b1 입니다")//변수 값을 참조할 때는 이렇게
    print("${b1} 입니다")//객체 값을 참조할 때는 이렇게
    println("${b1 > 3.14} 입니다")
}
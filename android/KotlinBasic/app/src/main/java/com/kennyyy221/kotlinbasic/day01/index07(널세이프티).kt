package com.kennyyy221.kotlinbasic.day01

fun main(){
    //자바는 null안정성이 없습니다.
    //코틀린의 null safety는 컴파일 시점에 에러를 잡을 수 있습니다.

//    String x = null
//    x.uppercase()

    //var a : String = null //null 지정이 안됨
    var a : String? = null //변수가 null 일수도 있음

    //?연산자는 = null이 아닐때 실행해라
    //null이 아니면 실행하고, null인 경우에는 null을 저장
    var b = a?.uppercase() //애시당초에 null일수도 있는 변수라
    print(b)

    print("\n------------------------------------------------")

    //?:대체값
    var first : String? = "hong"

    var second = (first?:"홍") //first가 null이면 "홍"으로 대체
    print(second)

    //!! - 내가 이거 null아닌것을 반드시 보장
    var k : String? = "null일수도 있는값"
    var result = k!!.uppercase() //만약 null이라면 runtime에러가 됩니다

    var result2 = k.run{
        println("null이 아닌 경우에 실행됨")
        "null아님"
    } ?: run{
        println("null인 경우에 실행됨")
        "null입니다"
    }
    print(result2)
}
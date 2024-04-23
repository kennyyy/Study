package com.kennyyy221.kotlinbasic.day05

import kotlin.math.log

//코틀린은 클래스 바깥에 함수 선언이 가능합니다.
fun some(a : Int){
    println("최상위함수 : " + a)
}

//익명함수
var some2 = fun(a: Int) {
    println("최상위함수 : " + a)
}

//람다식 - var 변수명 = { 매개변수 : 타입 -> 내용 }
var some3 = { a : Int ->
    println("람다함수 : " + a)
}

//람다가 한줄이라면 자동으로 리턴
var some4 = { a : Int, b : Int -> a + b} //a + b return

var some5 = { a : Int, b: Int ->
    println("내용")
    a + b//마지막줄값 리턴
}

//람다의 타입추론
//var some6 = { a : Int -> a * 10}

//typealias MyType = (매개변수타입) -> 리턴타입
//typealias MyType = (Int) -> Int
//var some7 : MyType = { a -> a * 10 }
//요 두개가 합쳐지면 아래와 같다
//람다타입
var some8 : (Int) -> Int = { a -> a * 10 }


//람다에서 it키워드 - 람다식에서 파라미터가 1개인 경우는 -> 를 생략하고 {}안에서 it키워드로 매개값 참조가능
var some9 : (Int) -> Int = {
    println("it : $it")//매개변수
    it * 10//리턴
}

//람다식은(고차함수) - 함수의 매개변수로 전달될 수 있음
 fun someFunc(a : Int , b : (Int) -> Boolean) : Boolean{
     //b는 함수일거야
     var result = b(a)//반환받음
    return result
 }



fun main(){
    //람다의 사용 - 람다는 함수라서 함수사용방법과 동일함
    println(some8(10))//100
    println(some9(10))//100

//    var x : (Int) -> Boolean = {
//        it == 10
//    }

    var result = someFunc(10, {
        it == 10
    })

    println(result)
    //만약 someFunc마지막에 전달되는 매개값이 람다라면, 람다식을 밖으로 뺄 수 있습니다.
    someFunc(10){
        it == 10
    }
}
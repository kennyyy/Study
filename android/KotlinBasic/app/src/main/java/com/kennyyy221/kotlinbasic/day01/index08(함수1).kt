package com.kennyyy221.kotlinbasic.day01

fun main(){
    func1() //void형
    var result = func2() //반환
    func3("홍길동", 20)
}


//코틀린에서 함수는 fun 키워드를 사용합니다
//함수의 반환유형 Unit은 void형을 의미합니다.
fun func1() : Unit{
    println("fun1 실행됨")
}
//함수의 반환유형은 함수명() : 반환유형
fun func2() : Int {
    return 100
}

//함수의 매개변수
fun func3(str : String, age : Int){
    println("$str 이고, $age 입니다")
}

//함수에서 express표현식 마치 when절처럼
//실행문장이 1개(줄이)라면 중괄호를 생략 하고, = 으로 표현됨
fun func4(name : String) = println("$name 입니다")

fun func5(a: Int, b : Int) : Int = a + b // a + b를 리턴
fun func6(a: Int, b : Int) : Int = if (a > b) a else b

fun func7(a: Int) : String {
    if(a == 10){
        return "sdfs"
    }
    return when(a) {
        1 -> "홍길동"
        2 -> "이순신"
        else -> "홍길자"
    }
}
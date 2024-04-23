package com.kennyyy221.kotlinbasic.day01

import java.util.Arrays

fun main(){

    func1("홍길동", 20)
    func1("이순신")

    func2(1,c = 3, b = 2)
    func2(b = 2, c = 3, a = 1)

    func3("홍길동", 1,2,3,4,5)
}

//함수의 default파라미터(기본값)
fun func1(name : String, age : Int = 0){
    println("$name, $age")
}

//함수의 named파라미터

fun func2(a : Int, b : Int, c : Int){
    println("$a, $b, $c")
}

//함수의 가변인자 선언
fun func3(name : String, vararg arr : Int){ //가변 매개변수 (가변적으로 변하는 매개변수)
    println(Arrays.toString(arr))
}
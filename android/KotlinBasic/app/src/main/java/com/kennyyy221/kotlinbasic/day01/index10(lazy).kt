package com.kennyyy221.kotlinbasic.day01

fun main(){
    var p = Person();
    p.name = "이순신"
    println(p.name)
    println(p.age)
    println(p.addr)
}


//클래스명과 파일명이 다르더라도, 상관없지만, 맞추는게 좋습니다.
class Person {

    //var age : Int   //null을 가지므로 안됨
    var age : Int? = null//멤버변수

    //초기값 미루기 = 초기값을 지정하지 않더라도 선언가능
    lateinit var name : String

    //val변수에만 선언가능
    val addr : String by lazy {
        println("hello world")
        "서울시"
    }
}
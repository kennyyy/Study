package com.kennyyy221.kotlinbasic.day02

import java.security.spec.PSSParameterSpec

//패키지명도 반드시 일치해야 하는것은 아닙니다


//먼저 코틀린은 파일명과 클래스명이 반드시 일치할 필요는 없습니다.
class ClassEx {
    //멤버변수
    var name : String = "홍길동"
    var age : Int? = null
    //함수
    fun some(){
        print("hello world")
    }
}

fun main(){
    var c : ClassEx = ClassEx()//new를 생략하고
    println(c.name)
    println(c.age)
    c.some()

    var p : Person = Person("홍길동")
    println(p.name)
}

//생성자 - 주생성자, 보조생성자
class Person(val name : String) {
    //이것은 자바 생성자 위에 구문하고 똑같은 의미
    // String name;
    // Person(String name){
    // this.name = name;
    //}

    var age : Int? = null
    init {
        //클래스가 생성될때 가장처음 실행됨
        println("hello init block")
        age = 20 //변수의 초기화 진행가능

    }
}


package com.kennyyy221.kotlinbasic.day04


//추상클래스
//abstract를 붙이면 추상클래스가 됩니다
//추상클래스는 추상메서드를 가질 수 있습니다.
//추상메서드는 {}가 없는 메서드 선언
abstract class Person {
    //변수가 추상형으로 선언될 수도 있습니다 (많이 사용x)
    //원래 변수는 선언과 동시에 초기화 하거나 or lateinit을 붙여야 하지만, 추상형으로 선언이 가능함
    abstract val name : String

    abstract fun some() //추상메서드

    fun mySome(){
        println("부모님의 mySome")
    }

}

class Child : Person(){
    //추상변수 오버라이딩
    override val name: String ="홍길동"

    //추상메서드 오버라이딩
    override fun some(){
        println("자식에서 오버라이드 된 메서드 $name")
    }

}

fun main() {
    val c = Child()
    println(c.some())
}
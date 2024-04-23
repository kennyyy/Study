package com.kennyyy221.kotlinbasic.day101

open class Parent{

    //메서드도 final메서드 선언
    //오버라이딩이 가능하게 하려면 open
    open fun some(){
        println("부모님의 메서드 실행")
    }


}

class Child : Parent(){

    override fun some() {
        println("자식에서 오버라이드된 메서드")
    }

    fun notSome(){
        println("자식만 사용가능한 메서드")
    }

}

fun main(){
    var c = Child()
    c.some()
    c.notSome()

    //클래스간 상호 형변환이 가능하려면 상속관계 필요합니다.
    var p = c as Parent
    //p.notSome()

    //부모타입에 자식타입은 자동캐스팅으로 변형됩니다.
    p = c



}
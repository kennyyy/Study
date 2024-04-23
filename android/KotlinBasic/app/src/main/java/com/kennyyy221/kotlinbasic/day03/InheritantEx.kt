package com.kennyyy221.kotlinbasic.day03


//코틀린은 기본적으로 final클래스가 됩니다.
//상속가능한 클래스로 만들고 싶다면 open키워드를 붙입니다.
open class Parent {
    fun some(){
        println("부모님의 some메서드")
    }
}

class Child : Parent(){

}

//////////////상속받는 클래스가 주생성자를 가질 때
open class Mother(val name : String, val age : Int){

}
//class Hong : Mother{
//    //자식에선 super를 이용해서 연결
//    constructor(name : String, age : Int) : super(name, age){
//
//    }
//}
class Hong(name : String, age : Int) : Mother(name, age){

}


fun main(){
    var c = Child()
    c.some()
}
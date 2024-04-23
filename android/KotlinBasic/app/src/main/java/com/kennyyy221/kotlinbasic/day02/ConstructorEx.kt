package com.kennyyy221.kotlinbasic.day02

//보조생성자 constructor
//보조생성자는 여러개 일수 있습니다 (보조 생정자 끼리는 연결이 가능)
class ConstructorEx {
    var name : String
    var age : Int? = null
    constructor(name : String) : this(name, 1){
        //this.name = name
    }
    constructor(name : String, age : Int){
        this.name = name
        this.age = age
    }
}

fun main(){
    var c = ConstructorEx("홍길동")
    println(c.name)
    println(c.age)
}
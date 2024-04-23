package com.kennyyy221.kotlinbasic.day02

//주생성자, 보조생성자를 같이 사용할 수 있습니다
//보조생성자에서 주생성자를 연결해야합니다
class ConstructorEx2(val name : String) {
    var age : Int? = null
    var addr : String? = null

    constructor(name : String, age : Int) : this(name) { //주생성자 연결
        this.age = age
    }

    //보조생성자가 주생성자와 연결되어 있어서 보조생성자로 연결이 가능
    constructor(name : String, age : Int, addr : String) : this(name, age){
        this.addr = addr
    }

    override fun toString(): String {
        return "ConstructorEx2(name='$name', age=$age, addr=$addr)"
    }

}

fun main(){
    var c1 = ConstructorEx2("홍길동");
    var c2 = ConstructorEx2("이순신", 20);
    var c3 = ConstructorEx2("강감찬", 30, "서울시");
    println(c1.toString())
    println(c2.toString())
    println(c3.toString())

}
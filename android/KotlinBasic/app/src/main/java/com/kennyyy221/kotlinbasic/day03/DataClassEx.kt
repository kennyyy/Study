package com.kennyyy221.kotlinbasic.day102


//클래스 앞에 data를 붙이면, 데이터를 저장하는 용도의 클래스가 됩니다. (즉, VO)
//소괄호를 열고, 멤버변수를 받습니다
//매개변수는 반드시 1개 이상이어야합니다.
data class User(
    var id: String,
    val age : Int
)

fun main(){
    var u = User("홍길동", 10)
    println(u.id)
    println(u.age)
    println(u.toString()) //toString메서드가 자동으로 오버라이딩 들어갑니다

}
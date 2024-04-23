package com.kennyyy221.kotlinbasic.day104

//인터페이스
interface MyIntere {
    var data1 : String //추상변수(변경가능)
    val data2 : String //추상변수(변경불가능)

    fun some() //추상메서드
    fun mySome(){ //일반메서드
        println("인터페이스에 만들어진 일반메서드")
    }

}

//인터페이스를 상속 받을 때는 ()를 뺍니다
class Person : MyIntere {
    override var data1: String = "홍길동"
        get() = field
        set(value) {
            field = value
        }
    override val data2: String = "이순신"
        get() = field

    override fun some() {
        println("오버라이드 된 메서드")
    }

}

fun main(){
    //인터페이스는 객체생성이 되지 않지만, 타입으로는 쓸수 있음

    var p : MyIntere = Person() // Person생성 인터페이스 저장

    var pp = p as Person //PerSon형변환
}
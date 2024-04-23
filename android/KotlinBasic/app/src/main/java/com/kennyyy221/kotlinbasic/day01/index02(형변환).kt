package com.kennyyy221.kotlinbasic.day01

fun main(){
    var x : Int = 10;
    var y : Double = 3.14;

    //var a : Double = x //스마트 캐스팅 불가

    //형변환을 할때는 toInt, toDouble, toString 등을 사용해서 형변환
    var a : Double = x.toDouble()
    var b : String = x.toString()
    var c : Float = x.toFloat()
    var d : Int = y.toInt()
    var e : Boolean = "true".toBoolean()

    println("$a, $b, $c, $d, $e")
}
package com.kennyyy221.kotlinbasic.day01

import java.util.Arrays

fun main(){
    //배열 - Array, mutable리스트(불변), ArrayList
    // var a = [1,2,3] //이런 문법 없음

    var arr = arrayOf(1,2,3)
    var arr2 = arrayOf(1,2,"홍길동")
    var arr3 = arrayOf<Int>(1,2,3,4,5)

    //배열의 사용
    arr[2] = 100;
    print(Arrays.toString(arr))
    print(Arrays.toString(arr2))
    print(Arrays.toString(arr3))

    //배열의 만드는 2nd
    val arr4 = Array(10, {0})//0으로 초기화
    var arr5 = Array(10, {i -> i + 1})//1, 2, 3 ....10
    var arr6 = Array(10,{i -> (i+1) * 10})

    println(Arrays.toString(arr4))
    println(Arrays.toString(arr5))
    println(Arrays.toString(arr6))

    //배열의 크기만 지정하는 방법
    var ar = IntArray(3) //크기가 3, 각타입의 기본값으로 초기화
    var ar2 = DoubleArray(5)

    println("----------------------------------------------------------")

    //불변리스트 - listof, 값의 변경이 불가, 단순히 사용(get)만 가능
    var arr7 = listOf<Int>(1,2,3,4,5)
    println(arr7[0])
    println(arr7[1])

    //arr7[0] = 100; err

    //ArrayListof = 값의 변경도 가능
    var list = arrayListOf<String>("a","b","c")
    println(list.get(0)) //값의 사용
    println(list[0])

    list[0] = "D" //값의 변경
    list.add("E") //값의 추가

    println(list)
}
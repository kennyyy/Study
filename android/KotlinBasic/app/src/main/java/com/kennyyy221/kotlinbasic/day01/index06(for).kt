package com.kennyyy221.kotlinbasic.day01

fun main(){
    //1..10 - 포함
    //1 until 10 - 미만
    //step - 점프값
    //downTo - 감소값
    //withIndex() - 인덱스 값과 값을 같이 얻음

    for(i in 1..10){
        print("$i ")
    }
    print("\n")
    for(i in 1 until 10){
        print("$i ")
    }
    print("\n")
    for(i in 1 until 100 step 2){
        print("$i ")
    }
    print("\n")
    for(i in 10 downTo 1){
        print("$i ")
    }
    print("\n")

    var arr = arrayOf(5,2,3,4,1)
    for(i in arr){
        print("$i ")
    }
    print("\n")

    var arr2 = arrayListOf<Int>(10,20,30,40,50)

    for((index, value) in arr2.withIndex()){
        print("$index : $value ")
    }



}
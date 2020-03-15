package com.alpharodun.lottomanager.Kotlin

var Chicken = 23000
val leg = 2

fun plus(A: Int, B: Int) : Int
{
    return A + B
}

fun plus2(A:Int, B:Int) = A + B

fun plus3(vararg numbers:Int)
{
    for(temp in numbers)
    {
        print("$temp ")
    }
}

fun printer(A:Int, B:Int):Int
{
    fun plus(A:Int, B:Int):Int
    {
        return A + B
    }

    return plus(A, B)
}

fun main (args:Array<String>)
{
    println(Chicken * 2)
    println("출력 입니다.")
    println(leg)

    var temp = plus(Chicken, leg)
    println("출력 값: $temp")

    temp = plus2(20, 5)
    println("출력 값2: $temp")

    print("출력 값3: ")
    plus3(10,20,30,40,50)

    temp = printer(10,4)
    print("\n출력 값4: $temp")
}


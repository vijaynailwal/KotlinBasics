package com.example.kotlinbasics.range

//smartherd 4.5
fun main(args: Array<String>) {
    var r1 = 1..5
    println(r1)

    var r2 = 'a'..'d'
    println(r2)

    var isPresent = 'c' in r2
    println(isPresent)

    var r3 = 5 downTo 1
    println(r3)

    var r4 = 5 downTo 1 step 2
    println(r4)

    var r5 = 10.downTo(1)
    println(r5)

    var r6 = 1.rangeTo(10)
    println(r6)
}
package com.example.kotlinbasics.koltinBasics

fun main() {

    var a = 10
    var b = 20

    var large = if (a > b) {
        println("b is largest")
        b
    } else {
        println("a is largest")
        a
    }

}

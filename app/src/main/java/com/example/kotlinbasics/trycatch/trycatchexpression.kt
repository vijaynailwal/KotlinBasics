package com.example.kotlinbasics.trycatch

import java.lang.Exception

fun main() {
    var a: Int = 5
    var b: Int = 0
    var z: Int = try {
        a / b
    } catch (e: Exception) {
        0
    }
    println(z)
}
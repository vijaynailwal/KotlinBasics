package com.example.kotlinbasics.koltinBasics

fun main() {
    var a = "red"
    when (a) {
        "red" -> {
            println("a is red")
        }
        "blue" -> {
            println("b is blue")
        }
        else -> {
            println("else executed")
        }

    }
// 2nd example in operator
    var x = 10
    when (x) {
        in 1..10 ->
            println("x is in 1 to 10")
        in 10..20 ->
            println("x is in 10 to 20")
        else ->
            println("default executec")
    }
}

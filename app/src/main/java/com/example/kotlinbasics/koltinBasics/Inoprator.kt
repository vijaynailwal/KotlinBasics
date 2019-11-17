package com.example.kotlinbasics.koltinBasics

fun main() {
    val a = 1
    when (a) {
        in 1..10 -> {
            println("value of 1 to 10 ${a}")
        }
        in 2..20 -> {
            println("value of ${a}")
        }
        else -> {
            println("else is executed")
        }

    }
}
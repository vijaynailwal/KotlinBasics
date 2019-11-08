package com.example.kotlinbasics.Map

import java.util.*

fun main() {
    var user = TreeMap<String, String>()
    user["username"] = "vijay"
    user["password"] = "1234"
    for ((key, value) in user) {
        println("${key} -> ${value}")
    }


}
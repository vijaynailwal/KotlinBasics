package com.example.kotlinbasics.Map

import java.util.*
import kotlin.collections.HashMap

fun main() {
    var user = HashMap<String, String>()
    user["password"] = "1234"
    user["username"] = "grv"
    for ((key, value) in user) {
        println("${key} -> ${value}")
    }


}
package com.example.kotlinbasics.List

fun main() {
    var name = listOf<String>(
            "vijay1", "vijay2", "vijay3", "vijay4"
    )

    for (list in name) {
        println(list)
    }

    for ((listindex, listname) in name.withIndex())
        println("at ${listindex} ${listname}")
}
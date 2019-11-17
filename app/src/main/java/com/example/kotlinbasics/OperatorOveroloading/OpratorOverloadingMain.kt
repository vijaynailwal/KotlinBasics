package com.example.kotlinbasics.OperatorOveroloading

fun main() {
    val power = OperatorOverload("vijay")
    power + "vijay1234"
}

operator fun OperatorOverload.plus(name: String) {
    namelist.add(name)
    for (p in namelist) {
        println(p)
    }
}
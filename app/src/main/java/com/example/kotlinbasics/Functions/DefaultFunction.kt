package com.example.kotlinbasics.Functions

fun main() {
    showData("vijay", "1234")


}

fun showData(name: String, password: String, defaultvalue: String="DEFAULT VALUE") {
    println(name)
    println(password)
    println(defaultvalue)
}
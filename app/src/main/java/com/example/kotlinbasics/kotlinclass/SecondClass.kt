package com.example.kotlinbasics.kotlinclass

fun main() {
    var hero = Hero()
    var sum=0
    println("accessing variable to another class ${hero.nickname}")

    sum=hero.add(2, 3)
    println("value of sum is ${sum}")
}
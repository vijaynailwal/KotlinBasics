package com.example.kotlinbasics.annonymousinnerclass

interface Hero {
    fun saveCity()
}

fun main() {
    var spidy: Hero = object : Hero {
        override fun saveCity() {

            println("vijay")
        }

    }
    spidy.saveCity()
}
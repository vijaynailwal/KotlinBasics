package com.example.kotlinbasics.lamdaandhigherorderfunction

fun makeMyHero(realName: String, heroName: String, make: (String, String) -> String) {
    val result = make(realName, heroName)
    println(result)
}

fun main() {
    val make: (String, String) -> String = { realName, heroName -> "$realName is now $heroName" }
    makeMyHero("Tony Stark", "Iron man", make)
}
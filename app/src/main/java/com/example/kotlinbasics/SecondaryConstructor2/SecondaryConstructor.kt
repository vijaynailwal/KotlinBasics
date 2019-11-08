package com.example.kotlinbasics.SecondaryConstructor2

class SecondaryConstructor {
    init {
        println("SecondaryConstructor executed")
    }

    constructor(id: String, name: String){
        println("secondary constructor ${id}")
        println("secondary constructor ${name}")

    }
}
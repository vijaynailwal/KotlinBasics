package com.example.kotlinbasics.BothPrimaryandSecondaryConst3

class Model(var email: String) {
    init {
        println("init block executed")
    }

    constructor(id: String, email: String, name: String) : this(email) {
        println(id)
        println(email)
        println(name)
    }
}
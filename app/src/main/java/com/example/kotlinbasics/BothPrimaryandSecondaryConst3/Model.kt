package com.example.kotlinbasics.BothPrimaryandSecondaryConst3

class Model(var email: String) {
    init {
        println("init block executed")
    }

    constructor(id: String, email: String, name: String) : this(email) {
        println("Primary Constructor executed inside secondary constructor id= $id")
        println("secondary constructor email = $email")
        println("secondary constructor name = $name")
    }
}
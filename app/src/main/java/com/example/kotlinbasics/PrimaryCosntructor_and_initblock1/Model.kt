package com.example.kotlinbasics.PrimaryCosntructor_and_initblock1

class Model(var name: String, var password: String) {
    init {
        println("after object created init executed")
        println("init block ${name}")
        println("init block ${password}")
    }
}

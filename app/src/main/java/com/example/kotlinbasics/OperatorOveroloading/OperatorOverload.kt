package com.example.kotlinbasics.OperatorOveroloading

class OperatorOverload(firstname: String) {
    var namelist = mutableListOf<String>()

    init {
        namelist.add(firstname)

    }
}
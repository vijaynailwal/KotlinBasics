package com.example.kotlinbasics.withapply


class WihApply {
    var name = "vijay"
    fun personMethod() {
        println("person class method is running")
    }
}

fun main(args: Array<String>) {
    var obj = WihApply()
    obj.name = "gaurav"
    println(obj.name)


    // you can access method and variable
    obj.apply {
        name = "alok in apply bloc "
        println(name)

    }.personMethod()


    //you can only access varable
    with(obj) {
        name = "alok in with block"
        println(name)
    }
}
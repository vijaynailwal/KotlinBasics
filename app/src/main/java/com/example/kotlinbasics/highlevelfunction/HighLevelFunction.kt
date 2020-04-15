package com.example.kotlinbasics.highlevelfunction

fun main(args: Array<String>) {
    var highLevelFunction = HighLevelFunction()
    highLevelFunction.addTwoNumber(1, 2)
    highLevelFunction.addTwoNumber(1, 3, object : MyInterface{
        override fun execute(a: Int) {
            println(a)
        }
    })
}

class HighLevelFunction {
    fun addTwoNumber(a: Int, b: Int, myInterface: MyInterface) {
        var sum = a + b
        myInterface.execute(sum)

    }

    fun addTwoNumber(a: Int, b: Int) {
        var sum = a + b

        println(sum)
    }
}

interface MyInterface {
    fun execute(a: Int)
}
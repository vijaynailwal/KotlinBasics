package com.example.kotlinbasics.nullhandling

fun main(args: Array<String>) {
    val name1: String? = null
    println("name1 ${name1?.length}")


    //it executes the block if the name is not null
    val name2: String? = null
    name2?.let {
        println("name2 ${name2.length}")
        println("it operate ${it}")
    }

//elvis operator
    val name3: String? = null
    val length = name3?.length ?: -1
    println("elvis operator length is $length")

}
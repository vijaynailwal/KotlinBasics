package com.example.kotlinbasics.dataclass

import com.example.kotlinbasics.singleton.User

//smartherd
 data class User(val username: String, val id: Int)

fun main(args: Array<String>) {

    var user1 = User("vijay", 101)
    var user2 = User("vijay", 101)
    println("object of user is = ${user1}")

//    println(user1===user2)

//    var newuser=user1.copy()
    //you can also change the value in object
//    var newuser = user1.copy(id = 1, username = "gaurav")
//    println("new uesr is {$newuser}")




}

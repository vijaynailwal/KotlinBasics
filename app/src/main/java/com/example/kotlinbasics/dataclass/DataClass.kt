package com.example.kotlinbasics.dataclass

data class User(val username: String, val password: String)

fun main() {
/*
    var user=User("vijay","123456")
    var user2=User("gaurav","123456")
    var newuser=user.copy("bhawna")
    println(user)
    println(user==user2)
    println(newuser)
*/

    fun getUser():User{
        return User("vijay","34334")
    }
    val(username,password)=getUser()
    println(" $username,$password")

}
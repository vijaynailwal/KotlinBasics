package com.example.kotlinbasics.singleton

data class User(var name: String, var password: String)

object Singletonmain {
    var list = mutableListOf<User>()
    fun showUser() {
        for (user in list) {
            println(user)
        }
    }

}
fun main() {
    Singletonmain.list.add(User("A", "a"))
    Singletonmain.list.add(User("B", "b"))
    Singletonmain.showUser()
}


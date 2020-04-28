package com.example.kotlinbasics.Infixfunction

//the func can take only single parameter
//imporves readability of code
// it should me extention or member function only

fun main() {
    var power = InfixFunc("vijay")
//    power.showName("vijay123")
    power showName "vijay1234"
}
//can contain only one parameter.
//fun InfixFunc.showName(name:String){
infix fun InfixFunc.showName(name: String) {
    namelist.add(name)
    for (p in namelist) {
        println(p)
    }
}
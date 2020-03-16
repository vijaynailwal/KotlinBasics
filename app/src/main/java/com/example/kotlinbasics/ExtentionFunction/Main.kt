package com.example.kotlinbasics.ExtentionFunction

//by the help of object you can define the function form outside the class
fun main() {
    var hero = Hero()
    hero.setPower("vijay")
    hero.showPower()

}

fun Hero.setPower(p: String) {
    power = p
}

fun Hero.showPower() {
    println(power)
}

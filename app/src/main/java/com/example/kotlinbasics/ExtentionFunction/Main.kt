package com.example.kotlinbasics.ExtentionFunction


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

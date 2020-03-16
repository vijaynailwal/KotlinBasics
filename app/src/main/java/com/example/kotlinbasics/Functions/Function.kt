package com.example.kotlinbasics.Functions


fun main() {
    println("add= "+add(5, 5))
    var numbers = listOf(1, 2, 3)
    println("getSum= "+getSum(numbers))

    println(findSquare(2))
    println("max="+max(2 , 3))


}

fun add(a: Int, b: Int): Int = a + b
fun getSum(numbers: List<Int>): Int {
    var sum = 0
    for (x in numbers) {
        sum += x
    }
    return sum
}

fun findSquare(a: Int) {
    println("findSquare= " + a * a)
}
fun max(a:Int,b:Int):Int=if(a>b) a else b
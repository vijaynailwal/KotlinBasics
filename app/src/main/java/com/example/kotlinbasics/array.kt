package com.example.kotlinbasics

fun main() {
//    case 1
    /*var a = arrayOf(1, 2, 3, 4, 5, "vijay")// you can put any type of array
//    println(a[0]) position 0 index
    for (x in a) {
        println(x)
    }
//    case 2
//   you can restrict type also
    var b = arrayOf<Int>(1, 2, 3)
    for (x in b) {
        println("value of ${x}")
    }
*/
//    case 3 :2d array
    var array2d = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(1, 2, 3)
            )

    for (i in array2d) {
        for (j in i) {
            print(j)
        }
        println()
    }
}
package com.example.kotlinbasics.koltinBasics

import java.math.BigInteger



//smartherd
fun main(args: Array<String>) {
    println(getFabnocciNumber(10000, BigInteger("1"), BigInteger("0")))
}
//tailrec-> prevents stackoverflow exception
tailrec fun getFabnocciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0)
        return b
    else
        return getFabnocciNumber(n - 1, a + b, a)
}
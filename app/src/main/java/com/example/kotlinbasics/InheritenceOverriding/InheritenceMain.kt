package com.example.kotlinbasics.InheritenceOverriding

// kotlin does not provide default constructor
//kotlin can inherit only those class which can open
//kotlin can inherit only those method which can open


open class NameClass {
   open fun name() {
        println("vijay")
    }
}

class Student : NameClass() {
    override fun name() {
//        super.name()//parent call
        println("gaurav")
    }

}


fun main() {
    val student = Student()
    student.name()


}
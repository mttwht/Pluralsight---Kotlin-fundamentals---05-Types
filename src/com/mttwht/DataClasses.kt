package com.mttwht

fun main(args: Array<String>) {
    var matt = Student2(1, "Matt")
    var mattAgain = Student2(1, "Matt")

    println(matt)

    if(matt == mattAgain) {
        println("Equal")
    } else {
        println("Nequal")
    }

    var notMatt = matt.copy(name = "Ryan")

    println(notMatt)
}

data class Student2(val id: Int, val name: String) {

}
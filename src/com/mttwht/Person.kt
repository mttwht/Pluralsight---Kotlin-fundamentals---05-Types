package com.mttwht

abstract class Person {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String =
        "$firstName $lastName"

    abstract fun getAddress() : String
}

class Student : Person() {
    override fun getAddress(): String =
        TODO("not implemented")

    override fun getName(): String =
        "$lastName, $firstName"
}

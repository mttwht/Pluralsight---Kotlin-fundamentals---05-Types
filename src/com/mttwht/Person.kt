package com.mttwht

open class Person {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
}

class Student : Person() {
    override fun getName(): String = "$lastName, $firstName"
}

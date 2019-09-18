package com.mttwht

fun main(args: Array<String>) {
    val matt = Student(1, 10)
    println(matt.id)
}

abstract class Person {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String =
        "$firstName $lastName"

    abstract fun getAddress() : String
}

class Student(val id: Int, _year: Int) : Person() {
    var year: Int
    var tutor: String

    init {
        year = _year
        tutor = ""
    }

    constructor(id: Int, _year: Int, tutor: String) : this(id, _year){
        this.tutor = tutor
    }

    fun enrol(courseName: String) {
        val course = Courses.allCourses
            .filter { it.Title == courseName }
            .firstOrNull()
    }

    override fun getAddress(): String =
        TODO("not implemented")

    override fun getName(): String =
        "$lastName, $firstName"
}

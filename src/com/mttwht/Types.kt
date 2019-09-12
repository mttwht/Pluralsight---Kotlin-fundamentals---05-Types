package com.mttwht

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: MyTime) = setTime(time.hours)
}

interface EndOfTheWorld {
    fun setTime(time: MyTime)
}

class MyTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class YetiTime : Time, EndOfTheWorld {
    override fun setTime(time: MyTime) {
        super<Time>.setTime(time)
    }

    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
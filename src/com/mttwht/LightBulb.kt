package com.mttwht

sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent) {
    println(when(event) {
        is PersonEvent.Awake -> "Awake"
        is PersonEvent.Asleep -> "Asleep"
        is PersonEvent.Eating -> "Eating ${event.food}"
    })
}

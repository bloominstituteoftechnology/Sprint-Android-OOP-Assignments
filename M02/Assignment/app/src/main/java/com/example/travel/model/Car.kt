package com.example.travel.model

data class Car(val type: String, val capacity: String): Vehicle(){
    override fun fly(): String = "This vehicle is $type, and can hold $capacity people"
    override fun toString(): String {
        return "Summary $type and $capacity"
    }
}

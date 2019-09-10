package com.example.travel.model

import java.io.Serializable

abstract class Vehicle (
    var id: String, var weight: Int, var isFav: Boolean
):Serializable{
    open fun fly(): String = " "

    override fun toString(): String {
        return "Objects id is $id, object weight is $weight, and is $isFav"
    }
}

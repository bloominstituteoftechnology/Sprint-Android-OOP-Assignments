package com.example.travel.model

import java.io.Serializable

abstract class Vehicle (
  open  var id: String? =null,
  open  var weight: Int = 0,
  open  var isFav: Boolean =false
):Serializable{
    open fun fly(): String = " "

    override fun toString(): String {
        return "Objects id is $id, object weight is $weight, and is $isFav"
    }
}

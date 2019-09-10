package com.example.travel.model

import java.io.Serializable

abstract class Vehicle (
  open  var id: String? = null,
  open  var weight: Int = 0,
  open  var isFav: Boolean =false
):Serializable{
    open fun travelBy(): String = "vehicle object"

    override fun toString(): String {
        return "vehicle travels by $weight, false"
    }
}

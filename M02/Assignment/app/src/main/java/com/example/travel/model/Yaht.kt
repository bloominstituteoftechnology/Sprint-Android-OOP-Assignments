package com.example.travel.model

class Yaht(var type: String = "water",
                var speed: String = "extremely slow",
                var isFavr: Boolean = false): Vehicle(), WaterTravel {
    override fun travelBy() : String = "Sailing by $type, that s the speed of $speed, and is $isFavr"
    override fun toString(): String {
        return "driving by boat type: $type, that is the speed of $speed, and is $isFavr"
    }

}
package com.example.travel.model

class Helicopter(var type: String = "Airbus",
            var altitude: String = "really high",
            var isFavr: Boolean = true): Vehicle(), AirTravel {
    override fun travelBy() : String = "Flying a/an $type, that s at an altitude of $altitude, and is $isFavr"
    override fun toString(): String {
        return "FLYING A  $type, that is at an altitude of $altitude, and is $isFavr"
    }

}

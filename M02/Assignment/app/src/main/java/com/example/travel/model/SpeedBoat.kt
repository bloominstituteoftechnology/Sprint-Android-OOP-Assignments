package com.example.travel.model

class SpeedBoat(var type: String = "water",
          var speed: String = "extremely fast",
          var isFavr: Boolean = false): Vehicle(), WaterTravel {
    override fun travelBy() : String = "Sailing by $type, that s the speed of $speed, and is $isFavr"
    override fun toString(): String {
        return "driving by boat type: $type, that is the speed of $speed, and is $isFavr"
    }

}

package com.example.travel.model

class Motorcycle(var type: String = "sped bike",
          var capacity: String = "One person, no luggage",
          var isFavr: Boolean = false): Vehicle(), GroundTravel {
    override fun travelBy() : String = "driving by car type: $type, that s capacity of $capacity, and is $isFavr"
    override fun toString(): String {
        return "driving by car type $type, that is capacity of $capacity, and is $isFavr"
    }

}

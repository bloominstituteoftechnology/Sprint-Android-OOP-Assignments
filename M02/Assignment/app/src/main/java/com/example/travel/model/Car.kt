package com.example.travel.model

class Car(var type: String = "passenger",
          var capacity: String = "4 door plus luggage",
          var isFavr: Boolean = true): Vehicle(), GroundTravel {
   override fun travelBy() : String = "driving by car type $type, that s capacity of $capacity, and is $isFavr"
    override fun toString(): String {
        return "driving by car type $type, that is capacity of $capacity, and is $isFavr"
    }

}

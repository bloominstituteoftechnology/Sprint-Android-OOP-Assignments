package com.example.aninterface.model

abstract class Vehicle(id: String, weight:Int, favorite:Boolean){
    abstract fun travel():String
}
//fly, sail, drive
interface AirTravel{
    fun fly(): String{
        return " takes to the sky!"
    }
}
interface WaterTravel{
    fun sail(): String{
        return " glides over the waves..."
    }
}
interface GroundTravel{
    fun drive():String{
        return "rolls across the earth"
    }
}
//six classes that inherit from vehicle and implement at least one interface
class FighterJet(id:String, weight: Int, favorite: Boolean) :Vehicle(id, weight, favorite), AirTravel{
    override fun travel():String{
        return " a $this.id travels by means of supersonic flight!"
    }
    override fun fly():String{
        return "$this.id takes to the skies!"
    }
}
class SpyBalloon(id:String, weight:Int, favorite:Boolean): Vehicle(id, weight, favorite), AirTravel{
    override fun travel(): String{
        return "A $this.id travels by floating stealthily through the sky"
    }
    override fun fly():String{
        return "$this.id takes to the skies!"
    }
}
class AlienUFO(id:String, weight:Int, favorite:Boolean):Vehicle(id, weight, favorite), AirTravel, GroundTravel, WaterTravel{
    override fun travel():String{
        return "This eldritch vessel carrying a cadre of hostile mutants moves through wormholes in space and time"
    }
    override fun fly():String{
        return "The warship obliterates atmospheres as it travels through them at speeds thought unreachable..."
    }
    override fun sail():String{
        return "As the propulsion devices of the ship near the water they boil it away and hover over the exposed seabed. A lake of destruction is all that remains of Poseidons domains"
    }
    override fun drive():String{
        return "The ground undulates in unnatural acceptance of alien gears churning newly disturbed soil as the galactic Warmachine pulls itself over Terra Firma"
    }
}
class RaceCar(id:String, weight: Int, favorite:Boolean):Vehicle(id, weight, favorite), GroundTravel{
    override fun travel():String{
        return "This Racecar travels on race tracks at top speed."
    }
}
class JetSki(id:String, weight:Int, favorite:Boolean):Vehicle(id, weight, favorite), WaterTravel{
    override fun travel():String{
        return "JetSki's glide across smooth lakes, and active surfs alike"
    }
    override fun sail():String{
        return "The JetSki zooms across the waters surface."
    }
}
class TroysDodgeJourney(id:String, weight:Int, favorite:Boolean):Vehicle(id, weight, favorite), GroundTravel{
    override fun travel():String{
        return "It'll get you from point A to point B...most of the time. It's got a roof. It rolls."
    }
    override fun drive():String{
        return "Tires Screech as I traverse the dangerous highways of Mid-Florida, dodging snow-birds and retiree's."
    }
}


var myCar = TroysDodgeJourney("Ol' reliable", 2000, true )

var alienStarDestroyer = AlienUFO("Imperial Cruiser", 1000000, false)

var wings = FighterJet("SonicJudgement", 1500, false)

var jetski = JetSki("WaveMaster", 500, false)

var racecar = RaceCar("Ritz Racecar",1500,false)

var fleet = mutableListOf(myCar, alienStarDestroyer, wings, jetski, racecar)
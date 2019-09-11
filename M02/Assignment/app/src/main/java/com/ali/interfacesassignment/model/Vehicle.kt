package com.ali.interfacesassignment.model

import java.io.Serializable

abstract class Vehicle (open val id : String, open val weight: Int,open var favorite: Boolean,open val index:Int):Serializable{
    abstract fun travel():String
}

interface AirTravel{
fun fly():String
}
interface WaterTravel{
fun sail():String
}
interface GroundTravel{
fun drive():String
}

class Helicopter(id:String,weight:Int,favorite: Boolean,index:Int):Vehicle(id,weight,favorite,index),AirTravel{
    override fun travel(): String {
        return "$id travels via ${fly()}"
    }

    override fun fly():String {
        return "Air"
    }
}
class Drone(id:String,weight:Int,favorite: Boolean,index:Int):Vehicle(id,weight,favorite,index),AirTravel{
    override fun travel(): String {
        return "$id travels via ${fly()}"
    }
    override fun fly():String {
        return "Air"
    }
}
class Car(id:String,weight:Int,favorite: Boolean,index:Int):Vehicle(id,weight,favorite,index),GroundTravel{
    override fun travel(): String {
        return "$id travels via ${drive()}"
    }
    override fun drive():String {
        return "Ground"
    }
}
class Bus(id:String,weight:Int,favorite: Boolean,index:Int):Vehicle(id,weight,favorite,index),GroundTravel{
    override fun travel(): String {
        return "$id travels via ${drive()}"
    }
    override fun drive():String {
        return "Ground"
    }
}
class Ship(id:String,weight:Int,favorite: Boolean,index:Int):Vehicle(id,weight,favorite,index),WaterTravel{
    override fun travel(): String {
        return "$id travels via ${sail()}"
    }
    override fun sail():String {
        return "water"
    }
}
class SeaPlane(id:String,weight:Int,favorite: Boolean,index:Int):Vehicle(id,weight,favorite,index),WaterTravel,AirTravel{
    override fun travel(): String {
        return "$id travels via ${sail()}&${fly()}"
    }
    override fun sail():String {
        return "Water"
    }
    override fun fly(): String {
        return "Air"
    }
}
object VehiclesList {

    var vehicles= ArrayList<Vehicle>()
}


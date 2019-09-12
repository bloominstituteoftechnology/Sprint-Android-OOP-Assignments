package com.example.interfaces

import android.util.Log

abstract class Vehicle {
    abstract fun travel()
}

class Tank: Vehicle(), GroundTravel{
    override fun travel() {
        drive()
    }

    override fun drive() {
        Log.i("${this.javaClass}", " driving with treads")
    }
}

class Submarine: Vehicle(), WaterTravel{
    override fun travel() {
        sail()
    }

    override fun sail() {
        Log.i("${this.javaClass}", " sailing with propulsion")
    }
}

class Helicopter: Vehicle(), AirTravel{
    override fun travel() {
        fly()
    }

    override fun fly() {
        Log.i("${this.javaClass}", " with choppers flying")
    }
}

class Airplane: Vehicle(), AirTravel{
    override fun travel() {
        fly()
    }

    override fun fly() {
        Log.i("${this.javaClass}", " with wings flying")
    }
}

class ATV: Vehicle(), GroundTravel{
    override fun travel() {
        drive()
    }

    override fun drive() {
        Log.i("${this.javaClass}", " driving with wheels")
    }
}

class Hovercraft: Vehicle(), WaterTravel, GroundTravel{
    override fun travel() {
        sail()
        drive()
    }

    override fun sail() {
        Log.i("${this.javaClass}", " with buoyancy sailing along")
    }

    override fun drive() {
        Log.i("${this.javaClass}", " with wheels driving along")
    }
}
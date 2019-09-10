package com.example.interfaces

abstract class Vehicle {
    abstract fun travel()
}

class Tank: Vehicle(), GroundTravel{
    override fun travel() {
        drive()
    }
}

class Submarine: Vehicle(), WaterTravel{
    override fun travel() {
        sail()
    }
}

class Helicopter: Vehicle(), AirTravel{
    override fun travel() {
        fly()
    }
}

class Airplane: Vehicle(), AirTravel{
    override fun travel() {
        fly()
    }
}

class ATV: Vehicle(), GroundTravel{
    override fun travel() {
        drive()
    }
}

class Hovercraft: Vehicle(), WaterTravel, GroundTravel{
    override fun travel() {
        sail()
        drive()
    }
}
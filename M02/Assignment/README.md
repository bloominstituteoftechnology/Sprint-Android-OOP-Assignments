# Kotlin Interfaces

### Instructions

You will write a set of classes which will inherit from a combination of interfaces. It may be easier to do this in the IntellJ IDE, but you can use Android Studio if you prefer.

## Requirements

1. Build three interfaces, `AirTravel`, `WaterTravel` and `GroundTravel` with methods for `fly`, `sail`, and `drive` respecitvely

2. Write a single base class called `Vehicle` with an abstract method called `travel`

> None of these methods will accept or return anything; they will just print out what they are doing and how. The "how" is important; ie. the helicopter class will "fly with rotors", the airplane will "fly with wings", and the rocket will "fly with fire"

3. Write 6 classes that inherit from the base class and implement a single or combination of interfaces. The travel method for each class will call the appropriate implemented method(s)

4. The main method (or possibly onCreate method in Android Studio) will create a list of Vehicles and call `travel()` on each of them

## Sample

```Kotlin
inner class Helicopter : Vehicle(), Fly {

    fun travel() {
        fly()
    }

    private fun fly() {
        println("Fly with Wings") // or for Android Studio: Log.("TAG", "Fly with Wings")
    }
    
}
```
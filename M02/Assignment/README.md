# Interfaces

### Instructions

In this assignment, you will write a set of classes which will inherit from an abstract class and implement  a combination of interfaces. 

Steps:
1. Create a new project using the Master/Detail template. This should give you two Activity classes, a Fragment class, and a dummy module with a DummyItem class.
2. Create a model package to contain the class and interface hierarchy you will be using.
3. In your model package, create the following (you can do this in one file or separate files):
* An abstract class `Vehicle` which has at a minimum properties `id : String`, `weight: Int`, and `favorite: Boolean` and an abstract method `fly` which takes no arguments and returns a `String`.
* Three interfaces, `AirTravel`, `WaterTravel` and `GroundTravel` with methods for `fly`, `sail`, and `drive` respectively.
* Six classes (whatever names you choose) that inherit from the `Vehicle` class and implement one or more of the interfaces. Implement the abstract and interface methods by creating a string that returns information about the `Vehicle` subclass (e.g., your `fly` body could be `return "$id travels via ${sail()} and ${drive()}"` with appropriate implementations of `sail` and `fly`)
* An object that is `ArrayList` of `Vehicle` subclasses. These will be used in the Master/Detail views
4. Replace the calls to `DummyItem` with references to your the new `ArrayList` you have created.
5. Use the `fly` method somewhere in the `RecyclerView` on `ItemListActivity` and somewhere in the fragment `ItemDetailFragment`. You can probably replace some of the `DummyItem` usages.
6. In the `ItemDetailFragment` class that was created, add a UI element or UI elements (perhaps a `Button`) that both shows you value of `favorite` for the item shown in the detail and to toggle its value.

Stretch
7. Create an interface for the Fragment that allows you to communicate with the Activity. Make the ItemListActivity and ItemDetailActivity implement the interface, then call the interface method from your UI element that toggles favorite. In the Activity classes you can show a Toast, a Snackbar, or perhaps notify the RecycleAdapter that the dataset has changed for the particular item.

## Requirements

1. You have created and used an abstract class called `Vehicle` with an abstract method called `travel`.

2. You have created and used three interfaces, `AirTravel`, `WaterTravel` and `GroundTravel` with methods for `fly`, `sail`, and `drive` respectively.

3. You have created and used 6 classes that inherit from the base class and implement a single or combination of interfaces. The travel method for each class will call the appropriate implemented method(s)

4. You have created a list of Vehicle objects that are used in the project.

5. You have implemented a Master/Detail template project that uses the Vehicle objects and calls their `travel` method in both the list of Vehicles and the Detail.

6. There is a UI element on the detail view that allows you to favorite a vehicle.

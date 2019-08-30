# Android Inheritance Shopping

### Instructions

For this project you'll use inheritance to store multiple different classes and objects in the same data structure and display them in a single recyclerview.

> For this assignment you are welcome to use the Master Detail Flow activity to start with. It will take a bit to work out where all the code is, but it will save a lot of boilerplate code.

## Requirements

1. Build a parent class called `ShoppingItem`
2. Give the class at least the following attributes an `int` for a color id and a `String` for the product name
> Each class will have a unique color value for the color id int field, this will be used to visually distinguish each different class in your recyclerview
> The class's constructor should be protected

3. Write a method for the class called getDisplayName which will return a `String` in this case, just the product name
> Subclasses will override this method and put their own spin on this method

4. Write at least 3 subclasses for this class. These should be different categories of items you'd purchase, like grocery items, clothing, etc... Each of the classes should have a constant value for the color resource id. In the class constructor, pass this constant up to the super constructor. These should all contain at least one unique data member
5. Override the getDisplayName method to make a unique twist on the display name ie size of the clothing item, or whether or not the grocery item must be refrigerated
5. Write a method in your main activity to generate test values and add them to a List
6. Build a `RecyclerView` to display the items in the new list.
> Set the background color of each item in the view to the color id stored in the object

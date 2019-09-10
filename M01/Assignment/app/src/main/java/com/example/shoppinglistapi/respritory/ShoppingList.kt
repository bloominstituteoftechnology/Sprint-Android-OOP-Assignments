package com.example.shoppinglistapi.respritory

//TODO 1 Build a parent class for shopping Item
//TODO 2 Give the class at least the following attributes an int for a color id and a String for the product name
//Each class will have a unique color value for the color id int field,
// this will be used to visually distinguish each different class in your recyclerview
// The class's constructor should be protected
open class  ShoppingList protected constructor(val colorId: Int, val productName: String, val itemPrice: String) {


    //    TODO 3 Write a method for the class called getDisplayName which will return a String in this case, just the product name
    //Subclasses will override this method and put their own spin on this method
    open fun getDisplayName(): String {

        return """

            Product name: $productName, $itemPrice

            Product price: $itemPrice

        """.trimIndent() //println(withoutIndent) // ABC\n123\n456

    }
}
    // TODO 4 Write at least 3 subclasses for this class.
    class GroceryItem(colorId: Int, productName: String, itemPrice: String, val isRefrigurated: Boolean)
        :ShoppingList(colorId, productName, itemPrice){

        //TODO 5 Override the getDisplayName method to make a unique twist on the display name ie size of the clothing item,
        // or whether or not the grocery item must be refrigerated

        override fun getDisplayName(): String {

            var fridge = ""
            if (isRefrigurated) fridge = "Yes" else fridge = "No"

            return """
                Product name: $productName
                Product price: $itemPrice
                Requires refriguration: $fridge
                """.trimIndent()
        }


    }
// TODO 7 create second subclass
class Cosmetics(colorId: Int, productName: String, itemPrice: String, val brand: String)
    : ShoppingList(colorId, productName, itemPrice){
    override fun getDisplayName(): String {
        return """
        Product name: $productName
        Product price: $itemPrice
        Product brand: $brand
        """.trimIndent()


    }
}
//TODO 8 create third subclass
class AutoItem(colorId: Int, productName: String, itemPrice: String, val part: String): ShoppingList(colorId, productName, itemPrice){
    override fun getDisplayName(): String {
        return """
        Product name: $productName
        Product price: $itemPrice
        Product brand: $part
        """.trimIndent()
    }
}




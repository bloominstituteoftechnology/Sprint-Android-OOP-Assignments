package com.example.inheritance

class GroceryItem(val groceryName: String, val weight: Double): ShoppingItem(4, groceryName) {
    override fun getDisplayName(): String {
        return "${super.getDisplayName()}\n${weight}kg"
    }
}
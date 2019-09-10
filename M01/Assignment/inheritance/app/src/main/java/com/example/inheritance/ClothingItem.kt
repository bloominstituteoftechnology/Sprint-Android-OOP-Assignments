package com.example.inheritance

class ClothingItem(val clothingName: String, val clothType: String) : ShoppingItem(5, clothingName){
    override fun getDisplayName(): String {
        return "${super.getDisplayName()}\n${clothType}"
    }
}
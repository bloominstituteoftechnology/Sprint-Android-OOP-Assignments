package com.example.inheritance

open class ShoppingItem(val colorId: Int, val productName: String){
    open fun getDisplayName() : String {
        return productName
    }
}
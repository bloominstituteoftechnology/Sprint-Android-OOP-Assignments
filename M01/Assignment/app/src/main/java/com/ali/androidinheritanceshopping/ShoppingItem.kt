package com.ali.androidinheritanceshopping

open class ShoppingItem(val colorId:Int,val productName:String){

    open fun getDisplayName():String{
        return productName
    }
}
class ClothingItem(colorId:Int,productName: String,val type:String):ShoppingItem(colorId,productName){
    override fun getDisplayName(): String {
        return "$productName:$type"

    }
}
class GroceryItem(colorId:Int,productName: String,val type:String):ShoppingItem(colorId,productName){
    override fun getDisplayName(): String {
        return "$productName:$type"

    }
}
class UtensilsItem(colorId:Int,productName: String,val type:String):ShoppingItem(colorId,productName){
    override fun getDisplayName(): String {
        return "$productName:$type"

    }
}


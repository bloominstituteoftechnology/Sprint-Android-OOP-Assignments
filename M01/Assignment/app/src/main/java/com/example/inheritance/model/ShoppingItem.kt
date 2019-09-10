package com.example.inheritance.model



open class ShoppingItem(open var name:String, val colorId: Int){

   open fun getDisplayName():String{
        return this.name
    }
}

class GroceryItem(name:String,colorId: Int,var isExpired:Boolean):ShoppingItem(name,colorId){
    override fun getDisplayName(): String {
        return "$name is expired $isExpired"

    }
}
class ClothingItem(name:String,colorId: Int,var size:Int):ShoppingItem(name,colorId){
    override fun getDisplayName():String{
        return "$name and it is a size $size"
    }
}

class ExcercuseItem(name: String,colorId: Int,var brand:String):ShoppingItem(name,colorId){
    override fun getDisplayName(): String {
        return "$name was designed by $brand"
    }
}




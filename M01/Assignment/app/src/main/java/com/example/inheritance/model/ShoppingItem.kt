package com.example.inheritance.model

import com.example.inheritance.R


open class ShoppingItem(open var name: String){
    open fun getDisplayName(): String{
        return this.name
    }
    var colorId : Int? = null
        protected set
}
class GroceryItem(name: String, var isExpired:Boolean ): ShoppingItem(name){
    init {
        super.colorId = R.color.colorPrimary
    }
    override fun getDisplayName(): String{
        return " $name is expired $isExpired"
    }
}
class ClothingItem(name: String,  var size: Int): ShoppingItem(name){
    init {
        super.colorId = R.color.colorAccent
    }
    override fun getDisplayName():String{
        return "this $name is size $size"
    }
}
class ExcerciseItem(name:String,  var brand: String): ShoppingItem(name){
    init {
        super.colorId = R.color.colorPrimaryDark
    }
    override fun getDisplayName():String{
        return "this $name is part of the brand $brand"
    }
}
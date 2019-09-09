package com.example.shoppinglistapi.respritory

import com.example.shoppinglistapi.respritory.ShoppingConstants.ITEM_NAMES_RAW

class ListRespritory {
    companion object {


        var createList = mutableListOf<ShoppingList>()
        // TODO combine into one list

        fun createView(){
            for(index in 0 until ITEM_NAMES_RAW.size)
                createList.add(ShoppingList(ITEM_NAMES_RAW[index], isChecked = false))
        }

    }
}
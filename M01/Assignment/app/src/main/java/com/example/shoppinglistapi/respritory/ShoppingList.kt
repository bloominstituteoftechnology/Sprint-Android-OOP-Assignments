package com.example.shoppinglistapi.respritory

import java.io.Serializable

data class ShoppingList(var name: String = "Almond",
                        var isChecked:  Boolean = false): Serializable
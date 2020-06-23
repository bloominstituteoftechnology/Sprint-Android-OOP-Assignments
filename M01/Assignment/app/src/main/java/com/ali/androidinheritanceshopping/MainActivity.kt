package com.ali.androidinheritanceshopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val shoppingItems = mutableListOf<ShoppingItem>()
    private val adapter = ShoppingListAdapter(shoppingItems)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        shoppingItems.add(GroceryItem(R.color.colorGrocery,"Milk","Keep Refrigrated"))
        shoppingItems.add(ClothingItem(R.color.colorClothing,"Jeans","Size-Medium"))
        shoppingItems.add(UtensilsItem(R.color.colorUtensils,"Spoon","Material-Metal"))
        shoppingItems.add(GroceryItem(R.color.colorGrocery,"Eggs","Organic"))
        shoppingItems.add(ClothingItem(R.color.colorClothing,"Shirt","Size-Large"))
        shoppingItems.add(UtensilsItem(R.color.colorUtensils,"Plate","Material-Plastic"))

        list_layout.setHasFixedSize(false)
        val manager = LinearLayoutManager(this@MainActivity)

        list_layout.layoutManager = manager
        list_layout.adapter = adapter


    }
}

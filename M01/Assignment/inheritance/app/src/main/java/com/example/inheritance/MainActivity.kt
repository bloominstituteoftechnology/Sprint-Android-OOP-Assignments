package com.example.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val shoppingItemList = mutableListOf<ShoppingItem>()
    val shoppingItemListAdapter = ShoppingItemListAdapter(shoppingItemList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        list_shopping_item.apply {
            layoutManager = manager
            adapter = shoppingItemListAdapter
        }

        val groceryItem1 = GroceryItem("Milk", 1.0)
        val groceryItem2 = GroceryItem("Watermelon", 2.0)
        val clothingItem1 = ClothingItem("Jeans", "Denim")
        val clothingItem2 = ClothingItem("Sweater", "Polyester")
        val applianceItem1 = ApplianceItem("Nintendo switch", 120.0)
        val applianceItem2 = ApplianceItem("Microsoft Surface Pro", 240.0)

        shoppingItemList.add(groceryItem1)
        shoppingItemList.add(groceryItem2)
        shoppingItemList.add(clothingItem1)
        shoppingItemList.add(clothingItem2)
        shoppingItemList.add(applianceItem1)
        shoppingItemList.add(applianceItem2)

        shoppingItemListAdapter.notifyDataSetChanged()
    }
}

package com.example.shoppinglistapi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglistapi.adapter.ShoppingListAdapter
import com.example.shoppinglistapi.respritory.GroceryItem
import com.example.shoppinglistapi.respritory.ShoppingList

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val NOTIFICATION_ID = 1

        const val CONSTANT_STRING = "CLICKS"
        const val CONSTANT_STRING2 = "SHOPPING LIST CREATED"
        const val ALMOND = "Almond"


    }
    // TODO 6 create itemList array
    val itemList = ArrayList<ShoppingList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // TODO 6.1 apply the itemList to the recycler view
        recycle.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ShoppingListAdapter(itemList)
        }
        // TODO 6.2 generate test values
        generateTestValues()
    }
    // so it takes test values from below and puts them in the shopping list
    private fun generateTestValues(){
        testValues.forEach{
            itemList.add(it)
        }

    }

    // TODO 6.3 those are my test values
    val testValues: ArrayList<ShoppingList> = arrayListOf(
        GroceryItem(
            Color.GREEN,
            "Eggs",
            "2.99",
            true
        ),
        GroceryItem(
            Color.GREEN,
            "Bread",
            "1.99",
            false
        )



    )
}

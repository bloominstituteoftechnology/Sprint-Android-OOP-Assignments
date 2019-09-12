package com.example.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.inheritance.model.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.shop_recycle_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       recyclerview.apply {
          layoutManager = LinearLayoutManager(this@MainActivity)
           adapter = ShoppingItemAdapter(shoppingList())
       }





        }

    }
fun shoppingList() : List<ShoppingItem>{

    var tShirt = ClothingItem("T-Shirt", 6)
    var socks = ClothingItem("socks",9)
    var shorts = ClothingItem("shorts", 3)


    var taco = GroceryItem("taco", false)
    var gum = GroceryItem("gum", true)
    var iceCream = GroceryItem("icecream", false)


    var yogaMat = ExcerciseItem("Yoga Mat", "konami")
    var bar = ExcerciseItem("barBell",  "Arnold Iron")
    var treadmill = ExcerciseItem("TreadMill","RunForest INC")

    return listOf(tShirt,socks, shorts, taco, gum, iceCream, yogaMat, bar, treadmill)
}




package com.example.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.inheritance.model.ClothingItem
import com.example.inheritance.model.ExcercuseItem
import com.example.inheritance.model.GroceryItem
import com.example.inheritance.model.ShoppingItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



            var tShirt = ClothingItem("T-Shirt",-16711936, 6 )
            var socks = ClothingItem("socks" ,-65536, 9)
            var shorts = ClothingItem("shorts",-65281, 3)
            var taco = GroceryItem("taco", -256, false)
            var gum = GroceryItem("gum", -1, true)
            var iceCream = GroceryItem("icecream", -256, false)
            var yogaMat = ExcercuseItem("Yoga Mat", -16711936, "Konami")
            var bar = ExcercuseItem("barBell", -65536, "Arnold Iron")
            var treadmill = ExcercuseItem("TreadMill", -65281, "RunForest INC")
        listOf(tShirt,socks, shorts, taco, gum, iceCream, yogaMat, bar, treadmill)
        }
    }


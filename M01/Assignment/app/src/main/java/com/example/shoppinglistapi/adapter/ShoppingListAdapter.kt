package com.example.shoppinglistapi.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglistapi.R
import com.example.shoppinglistapi.respritory.ShoppingList
import kotlinx.android.synthetic.main.shopping_list_item.view.*


class ShoppingListAdapter(val itemList: ArrayList<ShoppingList>): RecyclerView.Adapter<ShoppingListAdapter.CustomViewHolder>(){


    //class for the card view view holder
    //card view is also inherited by the recycler view
    class CustomViewHolder(view: View): RecyclerView.ViewHolder(view){
        //declare val for layout
        val layout: CardView = view.card_view
        //declare a val for the text view
        val textView: TextView = view.textView2
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shopping_list_item, parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        //bind holders
        holder.textView.text = itemList[position].getDisplayName()
        //since we declared layout val we can now set the background color to each item in the list
        holder.layout.setBackgroundColor(itemList[position].colorId)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}

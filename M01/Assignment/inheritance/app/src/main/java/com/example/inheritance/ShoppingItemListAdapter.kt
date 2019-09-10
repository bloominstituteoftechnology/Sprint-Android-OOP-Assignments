package com.example.inheritance

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shopping_item_view.view.*

class ShoppingItemListAdapter(val shoppingItemData: List<ShoppingItem>): RecyclerView.Adapter<ShoppingItemListAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val shopping_view = view.shopping_item as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shopping_item_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoppingItemData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.shopping_view.text = shoppingItemData[position].getDisplayName()
    }
}
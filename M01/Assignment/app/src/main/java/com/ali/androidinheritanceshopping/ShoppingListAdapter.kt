package com.ali.androidinheritanceshopping

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shopping_item_layout.view.*

class ShoppingListAdapter (val data: MutableList<ShoppingItem>) : RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shopping_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemInfo.text = data[position].getDisplayName()
        holder.itemView.background = ContextCompat.getDrawable(holder.itemView.context, data[position].colorId)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemInfo = view.item_info
    }
}

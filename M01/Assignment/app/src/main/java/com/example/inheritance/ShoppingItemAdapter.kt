package com.example.inheritance

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.inheritance.model.ShoppingItem
import kotlinx.android.synthetic.main.list_item_view.view.*

class ShoppingItemAdapter(val data:List<ShoppingItem>): RecyclerView
.Adapter<ShoppingItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
          val itemText: TextView = view.text_item
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.list_item_view,parent,false)
       return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
           holder.itemText.text = data[position].name
           data.get(position).colorId?.let { holder.itemText.setTextColor(ContextCompat.getColor(holder.itemText.context,it)) }
    }

}
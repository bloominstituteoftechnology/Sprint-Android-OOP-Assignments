package com.example.inheritance

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.inheritance.model.ShoppingItem
import kotlinx.android.synthetic.main.list_item_view.view.*

class ShoppingItemAdapter(val data:List<ShoppingItem>): RecyclerView
.Adapter<ShoppingItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
          val item: TextView = view.text_item_list
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.list_item_view,parent,false)
       return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
           holder.item.text = data[position].name
    }

}
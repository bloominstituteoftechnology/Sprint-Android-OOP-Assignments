package com.example.myapplication.RECYListAdapter

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.DetailsActivity
import com.example.myapplication.R
import com.example.myapplication.model.SerializedPokemon
import kotlinx.android.synthetic.main.pokemon_list_layout.view.*

class ListAdapter(val pokemonList: MutableList<SerializedPokemon>) : RecyclerView.Adapter<ListAdapter.CustomViewHolder>() {



    lateinit var context: Context



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        context = parent.context

        val view = LayoutInflater.from(context).inflate(R.layout.pokemon_list_layout, parent, false)

        return CustomViewHolder(view)

    }



    override fun getItemCount(): Int {

        return pokemonList.size

    }



    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val data = pokemonList[position]

        holder.pokemonName.text = data.name



        holder.layout.setOnClickListener {


            val intent = Intent(context, DetailsActivity::class.java)


   //     intent.putExtra("pokemon", position)
            (context as Activity).startActivity(intent)
            holder.pokemonName.text = data.name



        }




        holder.layout.setOnLongClickListener {

    /*        val title = "Delete Pokemon"

            val message = "Are you sure you want to delete this Pokemon?"

            val builder = AlertDialog.Builder(context)

            builder.setTitle(title)

                .setMessage(message)

                .setPositiveButton("YES") { dialog, which -> */

                    pokemonList.removeAt(position)


                   notifyDataSetChanged()

         //       }

        //        .setNegativeButton("NO") { _, _ -> }

       //         .create()

         //       .show()

            true

        }

    }



    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val layout: LinearLayout = view.pokemon_list_layout

        val pokemonName: TextView = view.textView_pokemon_list_name

    }

}
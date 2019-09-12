package com.example.myapplication

import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ListAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.model.Pokemon
import com.example.myapplication.model.SerializedPokemon
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity(), Callback<Pokemon> {

    override fun onFailure(call: Call<Pokemon>, t: Throwable) {

        Log.e("TAG", t.toString())
        Toast.makeText(this, "Call failed", Toast.LENGTH_SHORT).show()

    }



    override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {

        if (response.isSuccessful) {
            val pokemon = response.body() as Pokemon
            val ability = mutableListOf<String>()
            pokemon.abilities.forEach {
                ability.add(it.ability.name)

            }

            val types = mutableListOf<String>()
            pokemon.types.forEach {
                types.add(it.type.name)

            }



            val serializedPokemon = SerializedPokemon(pokemon.name,
                pokemon.sprites.front_default, // thats how front default is referenced in website API
                pokemon.id,
                ability,
                types)



            pokemonList.add(serializedPokemon)
            recyclerview_pokemon_list.adapter?.notifyDataSetChanged()
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("serializedPokemon", serializedPokemon)
            startActivity(intent)

        }

    }


    val pokemonList = mutableListOf<SerializedPokemon>()



    lateinit var pokemonSearch: PokemonAPI




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



        pokemonSearch = PokemonAPI.create()



        recyclerview_pokemon_list.apply {

            layoutManager = LinearLayoutManager(this@MainActivity)

            adapter = com.example.myapplication.RECYListAdapter.ListAdapter(pokemonList)

        }



        imageButton_search.setOnClickListener {

            val searchText = editText_search.text.toString()

            pokemonSearch(searchText)

        }





    }




    private fun pokemonSearch(id: String) {

        pokemonSearch.getPokemonById(id).enqueue(this)

    }



}


package com.ali.pokemonapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.ali.pokemonapp.GetPokemonActivity
import com.ali.pokemonapp.R
import com.ali.pokemonapp.model.Pokemon
import com.ali.pokemonapp.retrofit.PokemonApi
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<Pokemon> {
    lateinit var pokemonService: PokemonApi
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
        btn_search_pokemon.setOnClickListener {
            pokemonService= PokemonApi.Factory.create()
            val pokemonId:String=et_pokemon_no.text.toString()
            getPokemonbyId(pokemonId)

        }



    }
    private fun getPokemonbyId(pokemonId: String){
        pokemonService.getPokemonByIdorName(pokemonId).enqueue(this)
    }
    override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
        if(response.isSuccessful) {

            val pokemonDetails= response.body()
            layout_list.addView(createTextView(pokemonDetails?.name.toString(),pokemonDetails?.id.toString().toInt(),layout_list.childCount ))



        }


    }

    override fun onFailure(call: Call<Pokemon>, t: Throwable) {
        Toast.makeText(this,"Failed", Toast.LENGTH_SHORT).show()
    }
    fun createTextView(pokemonName: String,pokemonId:Int,index:Int): TextView {
        val view = TextView(this)
        view.text = "$pokemonName-$pokemonId"
        view.textSize = 24f
        view.tag=index
        view.id=pokemonId
        view.setOnClickListener {
            val intent = Intent(this, GetPokemonActivity::class.java)
            intent.putExtra("POKEMON_ID",pokemonName)
            startActivity(intent)
        }
        view.setOnLongClickListener {
            layout_list.removeViewAt(index)


            return@setOnLongClickListener true
        }

        return view
    }
}


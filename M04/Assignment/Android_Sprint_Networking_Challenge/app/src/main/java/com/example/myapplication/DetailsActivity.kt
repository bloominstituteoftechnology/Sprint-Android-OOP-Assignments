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
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.myapplication.model.SerializedPokemon
import com.example.myapplication.service.LargeImageDownloadService
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_details)



        val data = intent.getSerializableExtra("serializedPokemon") as? SerializedPokemon

//        pokemon = data

            // Referencing text views with each model item created

        val abilities = data?.ability.toString().replace("[", "").replace("]", "")

        val types = data?.type.toString().replace("[", "").replace("]", "")



     Picasso.get().load(data?.sprites).into(pokemon_image)

        text_view_pokemon_name.text = "Name: ${data?.name}"

        text_view_pokemon_number.text = "Pokemon No. ${data?.id}"

        text_view_pokemon_type.text = "Type: $types"

        text_view_pokemon_abilities.text = "Abilities: $abilities"




        //>>>>>>>>>>>

        }
}

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
    //set up a member var to hold broadcast receiver
    private lateinit var imageDownloadReceiver: BroadcastReceiver

    //TODO set up download manager
    private lateinit var downloadManager: DownloadManager

    // setting it up here so we can register or unregister for download receiver
    private lateinit var downloadReceiver: BroadcastReceiver

    //TODO fix the enque
    var enqueue: Long = 0






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

        imageDownloadReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                // guard against an intent doest have the right action
                if (intent?.action == LargeImageDownloadService.FILE_DOWNLOADED_ACTION) {
                    //gets the putExtra
                    val bitmap =
                        intent.getParcelableExtra<Bitmap>(LargeImageDownloadService.DOWNLOADED_IMAGE)
                    pokemon_image.setImageBitmap(bitmap)
                }
            }
        }
        downloadImage.setOnClickListener {
            // TODO: S04M04-4 Start service
            val serviceIntent = Intent(this, LargeImageDownloadService::class.java)
            serviceIntent.putExtra(LargeImageDownloadService.BITMAP_WIDTH, pokemon_image.width)
            serviceIntent.putExtra(LargeImageDownloadService.BITMAP_HEIGHT, pokemon_image.height)
            this.startService(serviceIntent)
            //this way it will be desabled
         //   myImageDownload.isEnabled = false

        }
        // TODO set up download manager (b)
        downloadManager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        downloadImage.setOnClickListener {
            //set up a request to enque (take the url and parse through Uri)
            val request = DownloadManager.Request(Uri.parse("https://cdn.bulbagarden.net/upload/thumb/0/0d/025Pikachu.png/1200px-025Pikachu.png"))

            enqueue = downloadManager.enqueue(request)
        }
        // TODO set up receiver to tell when download is done
        val downloadIntentFilter = IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE)

      downloadReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                val action = intent?.action
                when (action) {
                    DownloadManager.ACTION_DOWNLOAD_COMPLETE -> {
                        val query = DownloadManager.Query()
                        query.setFilterById(enqueue)
                        val c = downloadManager.query(query)
                        if (c.moveToFirst()) {
                            val columnIndex = c.getColumnIndex(DownloadManager.COLUMN_STATUS)
                            if (DownloadManager.STATUS_SUCCESSFUL == c.getInt(columnIndex)) {
                                val uriString = c.getString(c.getColumnIndex(DownloadManager.COLUMN_LOCAL_URI))
                                val uriFileDescriptor = contentResolver.openFileDescriptor(Uri.parse(uriString), "r")
                                val width = pokemon_image.width
                                val height = pokemon_image.height
                                pokemon_image.setImageBitmap(uriFileDescriptor?.let {
                                    decodeSampledBitmapFileDescriptor(
                                        it, width, height)
                                })
                            }
                        }
                    }
                    DownloadManager.ACTION_NOTIFICATION_CLICKED -> {
                    }
                    DownloadManager.ACTION_VIEW_DOWNLOADS -> {
                    }
                }
            }
        }

        // then register the receiver
        registerReceiver(downloadReceiver, downloadIntentFilter)

        // TODO to see if the download has actually occured







        // TODO: S04M04-6 Add IntentFilter
        //scopes intents
        val intentFilter = IntentFilter().apply {
            addAction(LargeImageDownloadService.FILE_DOWNLOADED_ACTION)
        }
        // TODO: S04M04-7 Register receiver
        //register using that filter
        LocalBroadcastManager.getInstance(this)
            .registerReceiver(imageDownloadReceiver, intentFilter)
    }
    override fun onDestroy() {
        super.onDestroy()
        // TODO S04M04-10 Unregister receivers
  //      unregisterReceiver(imageDownloadReceiver)
    }

    }










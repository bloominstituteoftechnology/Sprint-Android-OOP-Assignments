package com.example.myapplication.service

import android.app.DownloadManager
import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Bitmap
import android.net.Uri
import android.os.IBinder
import android.util.Log
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.myapplication.RECYListAdapter.NetworkAdapter
import java.lang.UnsupportedOperationException

// TODO: S04M04-1 create new service
class LargeImageDownloadService: Service(){
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.i("LargeImageDownload", "started")

        // TODO: S04M04-2 Override onStartCommand
        Thread(Runnable {
            // TODO: S04M04-3 Add network call
            val width = intent?.getIntExtra(BITMAP_WIDTH, 0) ?: 0
            val height = intent?.getIntExtra(BITMAP_HEIGHT, 0) ?: 0
            val bitmap = NetworkAdapter.getBitmapFromUrl("https://cdn.bulbagarden.net/upload/thumb/0/0d/025Pikachu.png/1200px-025Pikachu.png", width, height)

            //create an intent for send broadcast
            val intent = Intent(FILE_DOWNLOADED_ACTION)
                .apply {
                    putExtra(DOWNLOADED_IMAGE, bitmap) // use image key and put bitmap into it
                }
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent)

            stopSelf()
        }).start()


        return super.onStartCommand(intent, flags, startId)

    }

    override fun onCreate() {

        Log.i("LargeImageDownload", "created")
        super.onCreate()
    }

    override fun onDestroy() {
        Log.i("LargeImageDownload", "Destroyed")
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? {
        throw UnsupportedOperationException()
    }


    companion object{
        const val FILE_DOWNLOADED_ACTION = "com.lambdaschool.serviceimagedownloader.FILE_DOWNLOADED"
        const val DOWNLOADED_IMAGE = "downloaded image"
        const val BITMAP_HEIGHT = "200dp"
        const val BITMAP_WIDTH = "200dp"

    }

}
package com.example.myapplication.RECYListAdapter

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL

object NetworkAdapter {

    val GET = "GET"

    val POST = "POST"

    val PUT = "PUT"

    val DELETE = "DELETE"

    val TIMEOUT = 3000



    fun getBitmapFromUrl(stringUrl: String, width:Int = 0, height:Int = 0): Bitmap? {

        var result: Bitmap? = null

        var stream: InputStream? = null

        var connection: HttpURLConnection? = null

        try {

            val url = URL(stringUrl)

            connection = url.openConnection() as HttpURLConnection

            connection.readTimeout = TIMEOUT

            connection.connectTimeout = TIMEOUT



            connection.connect()



            if (connection.responseCode == HttpURLConnection.HTTP_OK) {

                stream = connection.inputStream

                if (stream != null) {

                    result = if (width > 0 && height > 0) {

                        Bitmap.createScaledBitmap(BitmapFactory.decodeStream(stream), width, height, true)

                    } else {

                        BitmapFactory.decodeStream(stream)

                    }

                }

            }



        } catch (e: MalformedURLException) {

            e.printStackTrace()

        } catch (e: IOException) {

            e.printStackTrace()

        } finally {

            connection?.disconnect()



            if (stream != null) {

                try {

                    stream.close()

                } catch (e: IOException) {

                    e.printStackTrace()

                }



            }

        }

        return result

    }

}
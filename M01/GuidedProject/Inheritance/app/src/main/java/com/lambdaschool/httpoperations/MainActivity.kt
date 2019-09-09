package com.lambdaschool.httpoperations

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.http_operations)

        GetButton.setOnClickListener {
            if (!isNetworkConnected()) {
              Snackbar.make(it, "Please check your internet connection and try again", Snackbar.LENGTH_LONG).show()
            } else {
                startActivity(Intent(this@MainActivity, GetPickerActivity::class.java))
            }
        }

        PostButton.setOnClickListener {
            if (!isNetworkConnected()) {
                Snackbar.make(it, "Please check your internet connection and try again", Snackbar.LENGTH_LONG).show()
            } else {
                startActivity(Intent(this@MainActivity, HttpPostActivity::class.java))
            }
        }

        PutButton.setOnClickListener {
            if (!isNetworkConnected()) {
                Snackbar.make(it, "Please check your internet connection and try again", Snackbar.LENGTH_LONG).show()
            } else {
                startActivity(Intent(this@MainActivity, HttpPutActivity::class.java))
            }
        }

        DeleteButton.setOnClickListener {
            if (!isNetworkConnected()) {
                Snackbar.make(it, "Please check your internet connection and try again", Snackbar.LENGTH_LONG).show()
            } else {
                startActivity(Intent(this@MainActivity, HttpDeleteActivity::class.java))
            }
        }
    }

    private fun isNetworkConnected(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo?.isConnected == true
    }
}

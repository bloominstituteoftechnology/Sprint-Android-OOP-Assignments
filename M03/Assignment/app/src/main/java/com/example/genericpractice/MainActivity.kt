package com.example.genericpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        // TODO 1 Create a simple example of a mutableList that takes strings as parameters
        val myStringList = singleList(1)
    }
    fun<T> singleList(t: T): List<T>{
        val theList = mutableListOf<T>()
        return theList
    }
    }




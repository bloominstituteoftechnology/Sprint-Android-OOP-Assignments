package com.example.genericpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }

    override fun onStart() {
        super.onStart()
        // TODO 1 Create a simple example of a mutableList that takes strings as parameters
       val myStringList = singleList("MY STRING LIST" )

    textView.setText("this is my single list: $myStringList")

    }

    fun <T> singleList(t: T): List<T> {
        val theList = mutableListOf<T>()
        theList.add(t)
        return theList
    }


}


class Phone1

    class CellularService1<T>(private var item: T){
        var open = false
        fun fetch(): T? {
            return item.takeIf { open }
        }

    }



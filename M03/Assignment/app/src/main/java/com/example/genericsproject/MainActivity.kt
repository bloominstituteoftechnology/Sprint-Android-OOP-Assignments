package com.example.genericsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /*the list of any "it was changed from a list of strings to a list of any
          I added the Int to the list thus allowing me to add in string or numbers
        */

        val listOfThings = mutableListOf("Tyler","Troy","Mark",10)
            listOfThings.add(1)

        val listOfNames = mutableListOf("Tyler","Troy","Mark")
        listOfNames.add("Marsh")




       val box = Box("My number")
        //box.value = 10


      myType("this String")


    }
       fun <T>myType(t:T){
           var value = 1


       }
}


class Box<T>(t:T) {
    var value = t
    val box: Box<Int> = Box<Int>(1)

}


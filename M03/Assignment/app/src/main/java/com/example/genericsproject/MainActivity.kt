package com.example.genericsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val observable = Observable.just(1,2,3)
        observable.subscribe(){Int -> return@subscribe ;1;2;3}


        var myList = mutableListOf<String>()
        val listOfThings = mutableListOf("Tyler","Troy","Mark",10)
        listOfThings.add(1)


        val listOfNames = mutableListOf("Tyler","Troy","Mark")
        listOfNames.add("Marsh")


        val box = Box("My number")
        //box.value = 10
        fun <T>myType(t:T){
            var value = 1

            Observable.fromArray(1,2,3)
        }
    }
    class Box<T>(t:T) {
        var value = t

    }
    var numberBox = Box(10)



    open class CellService(){
        var serviceType = "CellService"
    }
    class Tmobile(): CellService() {
        var carrier = "TMobile"
    }

    class Verizon(): CellService(){
        var carrier = "Verizon"
    }

    class Phone<T: CellService>(var service: CellService)
}






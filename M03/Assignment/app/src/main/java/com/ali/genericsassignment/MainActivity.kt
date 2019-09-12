package com.ali.genericsassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Part_1
        var ListOfString= mutableListOf<String>("A","B","C","D")
        //ListOfString.add(1)  error:The integer literal does not conform to the expected type String
       ListOfString.add("1")

        //part_2
        class Car<T> {

            private var car: T? = null
            fun put(p: T) {
                car= p
            }

            fun get(): T? {
                return car
            }
        }
        var sedan= Car<Int>()
       // sedan.put("s")    Type Mismatch Error


        //part_3
        fun <P> car(p: P): P {
            return p
        }

        //part_5
        open class CellularService
        class Phone<T :CellularService,K:CellularService>

        //part_6
        class TMobile:CellularService()
        class Verizon:CellularService()

       //part_7
        val observable = Observable.just("A", "B", "C")
        observable.subscribe() { String ->
            println(String)

        }

        //part_8
        open class Actor
        class TomCruise : Actor()
        class BradPitt : Actor()
        val actorObservable = Observable.just(TomCruise(), BradPitt())
        actorObservable.subscribe() { actors ->

            println("The observable returned $actors")

        }

    }
    data class Movie(val title: String,val language:String, val releaseDate: String)
    class MovieAPI {
        companion object {
            fun createMovieList(): Observable<List<Movie>> {
                return Observable.just(listOf(
                    Movie("Mission Impossible", "English", "1999"),
                    Movie("Home Alone", "English", "1992"),
                    Movie("ShowDown In Tokyo", "English", "2005"),
                    Movie("Nemo", "English", "2010")

                ))
            }
        }
    }


    }






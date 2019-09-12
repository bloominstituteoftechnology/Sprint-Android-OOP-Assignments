package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.view.View
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intObservable  = Observable.just(5, 6, 7)

        val actorObservable = Observable.just(Actor("Tom Cruise"), Actor("Angelina Jolie"))

        intObservable.subscribe(){
            int->println("The observable returned $int")
        }

        actorObservable.subscribe(){
            actor->println("The observable returned $actor")
        }
    }

    data class Actor(val name: String)

    fun returnString(): String{
        return "HELLO WORLD!"
    }

    class GenericClass<T: View>
    open class CellularService
    class TMobile: CellularService()
    class Verizon: CellularService()

    open class Phone<T: CellularService>

    class DummyMovieFakeAPI{
        companion object{
            fun create(): MovieAPI {

                return object: MovieAPI{

                    override fun getMovies(val title: String): Call<Movie>{

                    }

                }
            }
        }
    }


}

data class Movie(val yearOfRelease: Int, val title: String, val language: String, val imdbRating: Double)

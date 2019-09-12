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

        val movieObservable = DummyMovieFakeAPI.getFourMovieData()
        movieObservable.subscribe(){
            movie->println("The observable returned $movie")
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
            fun getFourMovieData(): Observable<List<Movie>>{
                return Observable.just(
                    listOf(Movie(2019, "Get Out", "English", 8.7),
                    Movie(2018, "Overlord", "English", 8.5),
                    Movie(2019, "Happy Death Day 2u", "English", 6.5),
                    Movie(2019, "The Last Black Man in San Francisco", "English", 9.0)
                    )
                )
            }
        }
    }
}

data class Movie(val yearOfRelease: Int, val title: String, val language: String, val imdbRating: Double)

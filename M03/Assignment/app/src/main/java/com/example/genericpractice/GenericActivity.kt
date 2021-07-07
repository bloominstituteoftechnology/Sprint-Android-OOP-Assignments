package com.example.genericpractice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_generic.*

class GenericActivity : AppCompatActivity() {

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic)

        val observer = Observable.just(
            "Tom Cruise",
            "Brat Pitt", "Jeniffer Aniston"
        )

        observer.subscribe { _ ->

            textView2.text = ""
        }


        data class Movie(val releaseYear: String, val title: String, val language: String)


        class FakeAPI {



    fun createMovieList(): Observable<List<Movie>> {

        return Observable.just(
            listOf(

                Movie(
                    "1992",

                    "The Mighty Ducks",

                    "English"
                ),

                Movie(
                    "2011",

                    "Moneyball",

                    "English"
                ),

                Movie(
                    "1965",

                    "The Saragossa Manuscript",

                    "Polish"
                ),

                Movie(
                    "1994",

                    "Pulp Fiction",

                    "English"
                )

            )
        )

    }

}

            }

        }


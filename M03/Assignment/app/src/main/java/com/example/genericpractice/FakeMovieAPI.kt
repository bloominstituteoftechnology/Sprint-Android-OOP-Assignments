package com.example.genericpractice

import io.reactivex.Observable

data class Movie(val releaseYear: String, val title: String, val language: String)

class FakeAPI {

    companion object {

        fun createMovieList(): Observable<List<Movie>> {

            return Observable.just(
                mutableListOf(
                Movie("1992",

                    "The Mighty Ducks",

                    "English"),

                Movie("2011",

                    "Moneyball",

                    "English"),

                Movie("1965",

                    "The Saragossa Manuscript",

                    "Polish"),

                Movie("1994",

                    "Pulp Fiction",

                    "English")

            )
            )

        }

    }

}

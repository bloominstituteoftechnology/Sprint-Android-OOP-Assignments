package com.lambdaschool.abstractionintpoly.retrofit


import com.lambdaschool.abstractionintpoly.model.Person
import com.lambdaschool.abstractionintpoly.model.Starship
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.concurrent.TimeUnit

// TODO 5: S05M02-5 Add the networking calls
interface StarWarsAPI {

    @GET("people/{id}")
    fun getPerson(@Path("id") id: Int): Call<Person>

    @GET("starships/{id}")
    fun getStarship(@Path("id") id: Int): Call<Starship>

    class Factory {

        companion object {

            private const val BASE_URL = "https://swapi.co/api/"

            fun create(): StarWarsAPI {

                val logger = HttpLoggingInterceptor()
                logger.level = HttpLoggingInterceptor.Level.BASIC

                val okHttpClient = OkHttpClient.Builder()
                    .addInterceptor(logger)
                    .retryOnConnectionFailure(false)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .build()

                val retrofit = Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                return retrofit.create(StarWarsAPI::class.java)
            }
        }
    }
}


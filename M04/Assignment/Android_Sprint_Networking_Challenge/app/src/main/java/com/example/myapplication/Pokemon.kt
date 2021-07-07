package com.example.myapplication

import com.example.myapplication.model.Pokemon
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.concurrent.TimeUnit


    interface PokemonAPI {


        @GET("pokemon/{name-id}")

        fun getPokemonById(@Path("name-id") nameOrId: String): Call<Pokemon>


        companion object {

            const val BASE_URL = "https://www.pokeapi.co/api/v2/"


            fun create(): PokemonAPI {

                val logger = HttpLoggingInterceptor()

                logger.level = HttpLoggingInterceptor.Level.BASIC

                logger.level = HttpLoggingInterceptor.Level.BODY


                val gson = GsonBuilder()

                    .setLenient()

                    .create()


                val okHttpClient = OkHttpClient.Builder()

                    .addInterceptor(logger)

                    .retryOnConnectionFailure(false)

                    .readTimeout(1000, TimeUnit.SECONDS)

                    .connectTimeout(1500, TimeUnit.SECONDS)

                    .build()


                val retrofit = Retrofit.Builder()

                    .baseUrl(BASE_URL)

                    .client(okHttpClient)

                    .addConverterFactory(GsonConverterFactory.create(gson))

                    .build()



                return retrofit.create(PokemonAPI::class.java)

            }

        }

    }

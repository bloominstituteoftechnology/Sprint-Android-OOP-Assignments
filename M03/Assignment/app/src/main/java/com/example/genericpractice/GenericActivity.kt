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

    val observer = Observable.just("Tom Cruise",
        "Brat Pitt", "Jeniffer Aniston")

        observer.subscribe{ _ ->

            textView2.text = "$observer"
        }


}}

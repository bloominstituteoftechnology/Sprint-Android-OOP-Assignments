package com.lambdaschool.httpoperations

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.lambdaschool.httpoperations.retrofit.JsonPlaceHolderApi
import kotlinx.android.synthetic.main.activity_http_get.*

// TODO 1: Look at Http<Op>Activity classes for behavior to extract
open class HttpActivity: AppCompatActivity(){
    lateinit var jsonPlaceHolderApi: JsonPlaceHolderApi

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        initializeApi()
    }

    open fun initializeApi() {
        jsonPlaceHolderApi = JsonPlaceHolderApi.Factory.create()
    }

    open fun onFailure(throwable: Throwable){
        progressBar.visibility = View.GONE
        result.text = throwable.toString()
    }
}



// TODO 2: Define a parent class in this file called HttpActivity that extracts it

// TODO 3: Derive the Http<Op>Activity classes from HttpActivity

// TODO 4: Notice the effect of qualifiers like open override, etc.


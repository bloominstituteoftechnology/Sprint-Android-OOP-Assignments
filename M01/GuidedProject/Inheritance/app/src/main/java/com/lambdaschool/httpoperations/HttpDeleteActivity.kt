package com.lambdaschool.httpoperations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import androidx.core.text.bold
import com.lambdaschool.httpoperations.retrofit.JsonPlaceHolderApi
import kotlinx.android.synthetic.main.activity_http_get.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HttpDeleteActivity : HttpActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_http_get)
        title = "Delete Request: Delete existing employee with id 1"
        deleteEmployee()
    }

    private fun deleteEmployee(){
        jsonPlaceHolderApi.deleteEmployee("1").enqueue(object : Callback<Void> {
            override fun onFailure(call: Call<Void>, throwable: Throwable) {
                progressBar.visibility = View.GONE
                result.text = throwable.toString()
            }

            override fun onResponse(call: Call<Void>, response: Response<Void>) {
                progressBar.visibility = View.GONE
                if (!response.isSuccessful) {
                    result.text = "Code: ${response.code()}"
                } else {
                    val employee = response.body()
                    val content = SpannableStringBuilder()
                    content
                        .bold { append("Code: ") }
                        .append(response.code().toString()).append("\n")
                    result.text = content
                }
            }
        })
    }
}

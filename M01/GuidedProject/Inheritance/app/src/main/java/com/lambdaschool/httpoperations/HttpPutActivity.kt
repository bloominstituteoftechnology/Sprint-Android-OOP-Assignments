package com.lambdaschool.httpoperations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import androidx.core.text.bold
import com.lambdaschool.httpoperations.model.Employee
import com.lambdaschool.httpoperations.retrofit.JsonPlaceHolderApi
import kotlinx.android.synthetic.main.activity_http_get.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HttpPutActivity : HttpActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_http_get)
        title = "Put Request: Update existing Employee Steve"
        updateEmployee()
    }

    private fun updateEmployee(){
        val employee = Employee(age = 25, id = 1, name = "Steve", title = "Principal Engineer")
        jsonPlaceHolderApi.updateEmployee(employee).enqueue(object : Callback<Employee> {
            override fun onFailure(call: Call<Employee>, throwable: Throwable) {
                progressBar.visibility = View.GONE
                result.text = throwable.toString()
            }

            override fun onResponse(call: Call<Employee>, response: Response<Employee>) {
                progressBar.visibility = View.GONE
                if (!response.isSuccessful) {
                    result.text = "Code: ${response.code()}"
                } else {
                    val employee = response.body()
                    val content = SpannableStringBuilder()
                    content
                        .bold { append("Code: ") }
                        .append(response.code().toString()).append("\n")
                        .bold { append("Name: ") }
                        .append(employee?.name).append("\n")
                        .bold { append("Id: ") }
                        .append(employee?.id.toString()).append("\n")
                        .bold { append("Age: ") }
                        .append(employee?.age.toString()).append("\n")
                        .bold { append("Title: ") }
                        .append(employee?.title).append("\n").append("\n")

                    result.text = content
                }
            }
        })
        }

}

package com.lambdaschool.httpoperations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import androidx.core.text.bold
import com.lambdaschool.httpoperations.model.Employee
import com.lambdaschool.httpoperations.model.employeesFakeData
import com.lambdaschool.httpoperations.retrofit.JsonPlaceHolderApi
import kotlinx.android.synthetic.main.activity_http_get.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HttpGetActivity : HttpActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_http_get)
        val type = intent.getStringExtra("get")
        if (type == "simple") {
            title = "GET - Simple Request"
            getEmployees()
        } else if (type == "path") {
            title = "GET - Path Parameter: EmployeeId - 1"
            getEmployees("1")
        }
        else{
            title = "GET - Query Parameter: Age - 55"
            getEmployeesForAge("25")
        }
    }

    private fun getEmployees(){
        jsonPlaceHolderApi = JsonPlaceHolderApi.Factory.create()
        jsonPlaceHolderApi.getEmployees().enqueue(object : Callback<List<Employee>>{

            override fun onFailure(call: Call<List<Employee>>, throwable: Throwable) {
                this@HttpGetActivity.onFailure(throwable)
            }

            override fun onResponse(call: Call<List<Employee>>, response: Response<List<Employee>>) {
                progressBar.visibility = View.GONE
                if (!response.isSuccessful) {
                    result.text = "Code: ${response.code()}"
                } else {
                    val employees = response.body()
                    val content = SpannableStringBuilder()
                    employees?.forEach { employee ->
                        content
                            .bold { append(employee.signature()) }
                            .append("\n")
                            /*.append(employee.name).append("\n")
                            .bold { append("Id: ") }
                            .append(employee.id.toString()).append("\n")
                            .bold { append("Age: ") }
                            .append(employee.age.toString()).append("\n")
                            .bold { append("Title: ") }
                            .append(employee.title).append("\n").append("\n")*/
                    }
                    result.text = content
                }
            }
        })
    }

    private fun getEmployees(employeeId: String){
        jsonPlaceHolderApi = JsonPlaceHolderApi.Factory.create()
        jsonPlaceHolderApi.getEmployees(employeeId).enqueue(object : Callback<List<Employee>>{

            override fun onFailure(call: Call<List<Employee>>, throwable: Throwable) {
                progressBar.visibility = View.GONE
                result.text = throwable.toString()
            }

            override fun onResponse(call: Call<List<Employee>>, response: Response<List<Employee>>) {
                progressBar.visibility = View.GONE
                if (!response.isSuccessful) {
                    result.text = "Code: ${response.code()}"
                } else {
                    val employees = response.body()
                    val content = SpannableStringBuilder()
                    employees?.forEach { employee ->
                        content
                            .bold { append(employee.signature()) }
                            .append("\n")
                            /*.bold { append("Name: ") }
                            .append(employee.name).append("\n")
                            .bold { append("Id: ") }
                            .append(employee.id.toString()).append("\n")
                            .bold { append("Age: ") }
                            .append(employee.age.toString()).append("\n")
                            .bold { append("Title: ") }
                            .append(employee.title).append("\n").append("\n")*/
                    }
                    result.text = content
                }
            }
        })
    }

    private fun getEmployeesForAge(age: String){
        jsonPlaceHolderApi = JsonPlaceHolderApi.Factory.create()
        jsonPlaceHolderApi.getEmployeesForAge(age).enqueue(object : Callback<List<Employee>>{

            override fun onFailure(call: Call<List<Employee>>, throwable: Throwable) {
                progressBar.visibility = View.GONE
                result.text = throwable.toString()
            }

            override fun onResponse(call: Call<List<Employee>>, response: Response<List<Employee>>) {
                progressBar.visibility = View.GONE
                if (!response.isSuccessful) {
                    result.text = "Code: ${response.code()}"
                } else {
                    val employees = response.body()
                    val content = SpannableStringBuilder()
                    // TODO 9: Return the signature here instead of the name, id, etc.
                    employees?.forEach { employee ->
                        content
                            .bold { append(employee.signature()) }
                            .append("${employee is Employee}\n")
                            .append("\n")
                            /*.bold { append("Name: ") }
                            .append(employee.name).append("\n")
                            .bold { append("Id: ") }
                            .append(employee.id.toString()).append("\n")
                            .bold { append("Age: ") }
                            .append(employee.age.toString()).append("\n")
                            .bold { append("Title: ") }
                            .append(employee.title).append("\n").append("\n")*/
                    }
                    result.text = content
                }
            }
        })
    }

}

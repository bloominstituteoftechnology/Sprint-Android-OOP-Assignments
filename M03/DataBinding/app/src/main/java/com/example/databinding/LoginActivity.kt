package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityLoginBinding
import com.example.databinding.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

 //   private val viewModel = LoginViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
   val binding =  DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
    binding.viewModel = LoginViewModel()
        binding.executePendingBindings()

    }
    // binding adapter two way
    companion object{
        @BindingAdapter("Toast message")
        @JvmStatic
        fun showToast(view: View, message: String?){
            message?.let {
                Toast.makeText(view.context, it, Toast.LENGTH_LONG).show()
            }
        }
    }
}

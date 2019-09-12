package com.example.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityViewBinding
import com.example.myapplication.model.PokemonView
import com.example.myapplication.viewmodel.ViewModel

class View : AppCompatActivity() {

   // private var viewModel = ViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = DataBindingUtil.setContentView<ActivityViewBinding>(this,R.layout.activity_view)
        binding.viewModel = ViewModel()
        binding.executePendingBindings()
    }

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

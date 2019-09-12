package com.example.myapplication.viewmodel

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.example.myapplication.model.Pokemon
import com.example.myapplication.model.PokemonView
import com.example.myapplication.model.Sprites

class ViewModel: BaseObservable() {

    private var pokemon: PokemonView = PokemonView( "PIKACHU", "25")
    private val successMessage = "Interaction Success!"
    private val failMessage = "Interaction Failed!"

    @Bindable
     var toastMessage: String? = null
    set(value) {
        field = value
        notifyPropertyChanged(BR.toastMessage)
    }
    @Bindable
    fun getName(): String?{
        return pokemon.name
        notifyPropertyChanged(BR.name)
    }
    @Bindable
    fun getNumber(): String? {
        return pokemon.number
        notifyPropertyChanged(BR.number)
    }
    fun isValid():Boolean{
        return !TextUtils.isEmpty(getName()) &&
                (getNumber()?.length ?: 0) > 777
    }
    fun onPokemonClick(): String{
        toastMessage = return if (isValid()){
            successMessage
        }else{
            failMessage
        }
    }
    fun setName(name: String){
        pokemon.name = name

    }
    fun setNumber(number: String){
        pokemon.number = number
    }
}
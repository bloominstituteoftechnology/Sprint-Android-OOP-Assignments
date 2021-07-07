package com.example.databinding.viewmodel


import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.databinding.BR


import com.example.databinding.model.User


class LoginViewModel: BaseObservable() {

    private var user: User = User("","")
    private val successMessage = "login success!"
    private val failMesseage = "Login failed"

    @Bindable
    var toastMessage: String? = null
    set(value){
        field = value
   //     notifyPropertyChanged(BR._all)
    }

    @Bindable
    fun getUserEmail(): String?{
        return user.email
    }
    @Bindable
    fun getUserPassword():String? {
        return user.password
    }
    // if you dont fill this out the you get an arror
    fun isValid():Boolean{
        return !TextUtils.isEmpty(getUserEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() &&
                // password
                (getUserPassword()?.length ?: 0) > 7
    }

    //when log in button is clicked
    fun onLoginClick(): String{
        toastMessage =return if (isValid()){
            successMessage

        }else{
            failMesseage
        }

    }
    //set stuff up
    fun setUserEmail(email: String){
        user.email = email


    }
    fun setPassword(password: String){
        user.password = password
    }

    //  init {
    //    user = User("", "")
   // }

}
package com.lambdaschool.abstractionintpoly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.abstractionintpoly.model.Person
import io.reactivex.Observable
import java.util.*

class Generics : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generics)
    }

    override fun onStart() {
        super.onStart()



    open class Person
        class Mark: Person()
        class Tim : Person()

        val personObservable = io.reactivex.Observable.just(Mark(), Tim())

        personObservable.subscribe() {print("$personObservable")}
    }
    class NetworkAPI{
        companion object{
            fun getListPeople(): io.reactivex.Observable<List<Person>> {
                return Observable.just(listOf(Person("fd","130", "blond","white", "blue")))
            }
       }
    }
}

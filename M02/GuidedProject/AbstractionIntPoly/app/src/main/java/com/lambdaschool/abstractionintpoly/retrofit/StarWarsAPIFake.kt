package com.lambdaschool.abstractionintpoly.retrofit

import com.lambdaschool.abstractionintpoly.model.Person
import com.lambdaschool.abstractionintpoly.model.Starship
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// TODO 18: Sketch out a FakeApi

//Here's the entire file. With this fake API, you could
// call StarWarsAPIFake.Factory.create() in place of StarWarsAPI.create() and use it to feed your own data to your app.

class StarWarsAPIFake {
    class Factory {
        companion object {
            fun create(): StarWarsAPI {
                return object : StarWarsAPI {
                    override fun getPerson(id: Int): Call<Person> {
                        return fakePersonCall
                    }
                    override fun getStarship(id: Int): Call<Starship> {
                        return fakeStarshipCall
                    }
                }
            }
        }
    }
}
val person = Person(
    height = "228",
    mass = "112",
    hairColor = "brown",
    skinColor = "unknown",
    eyeColor = "blue"
)
val starship = Starship(
    model = "Twin Ion Engine Advanced x1",
    manufacturer = "Sienar Fleet Systems",
    costInCredits = "unknown",
    length = "9.2"
)
val fakePersonCall = object : Call<Person> {
    override fun enqueue(callback: Callback<Person>) {
        val response = Response.success(person)
        callback.onResponse(this, response)
    }
    override fun isExecuted(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun clone(): Call<Person> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun isCanceled(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun cancel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun execute(): Response<Person> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun request(): Request {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
val fakeStarshipCall = object : Call<Starship> {
    override fun enqueue(callback: Callback<Starship>) {
        val response = Response.success(starship)
        callback.onResponse(this, response)
    }
    override fun isExecuted(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun clone(): Call<Starship> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun isCanceled(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun cancel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun execute(): Response<Starship> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun request(): Request {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
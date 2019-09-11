package com.lambdaschool.abstractionintpoly.model

import com.google.gson.annotations.SerializedName

/*
{
    name: "Chewbacca",
    height: "228",
    mass: "112",
    hair_color: "brown",
    skin_color: "unknown",
    eye_color: "blue",
    url: "https://swapi.co/api/people/13/"
}
 */

// TODO 2: S05M02-2 Add class which inherits from parent class
data class Person(
    val height: String,
    val mass: String,
    @SerializedName("hair_color") val hairColor: String,
    @SerializedName("skin_color") val skinColor: String,
    @SerializedName("eye_color") val eyeColor: String
) : SwApiObject() {

    override fun info(): String = "EYES: $eyeColor\nURL = $url"

    override fun toString(): String {
        return "$name is $height cm tall, they have $skinColor skin and $hairColor hair with $eyeColor eyes."
    }
}


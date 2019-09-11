package com.lambdaschool.abstractionintpoly.model

import com.google.gson.annotations.SerializedName

/*
{
    name: "TIE Advanced x1",
    model: "Twin Ion Engine Advanced x1",
    manufacturer: "Sienar Fleet Systems",
    cost_in_credits: "unknown",
    length: "9.2",
    url: "https://swapi.co/api/starships/13/"
}
 */

// TODO 3: S05M02-3 Add class which inherits from parent class
data class Starship(
    val model: String,
    val manufacturer: String,
    @SerializedName("cost_in_credits") val costInCredits: String,
    val length: String
) : SwApiObject() {

    override fun info(): String = "COST: $costInCredits\nURL = $url"

    override fun toString(): String {
        return "$name, model $model is manufactured by $manufacturer, is $length m in length, and was built at a cost of $costInCredits credits. Url is $url"
    }
}


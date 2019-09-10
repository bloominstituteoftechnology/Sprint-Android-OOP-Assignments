package com.lambdaschool.abstractionintpoly.model

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
data class Starship (
    var model: String, val manufacture: String, val costCredits: String, val length: String

): SwApiObject(){
    override fun info(): String ="$model,  $manufacture"
    override fun toString(): String{
        return "$model, some text here $costCredits, some text here $name"
    }
}


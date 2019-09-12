package com.example.myapplication.model

import java.io.Serializable


data class Sprites (
    // thats how front default is referenced in website API (for the image)
    val front_default: String

)



data class Ability(

    val name: String

)



data class AblityList(

    val ability: Ability

)



data class Type(

    val name: String

)



data class TypeList(

    val type: Type

)





data class Pokemon (

    var name: String,

    val sprites: Sprites,

    var id: Int,

    //thats how to reference the list of abilities

    val abilities: List<AblityList>,

    val types: List<TypeList>

)



data class SerializedPokemon(

    var name: String,

    var sprites: String,

    var id: Int,

    var ability: MutableList<String>,

    var type: MutableList<String>

): Serializable




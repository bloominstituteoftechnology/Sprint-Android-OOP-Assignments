package com.lambdaschool.abstractionintpoly

// TODO 4: S05M02-4 Examine class to resolve resources
object DrawableResolver {

    const val CHARACTER = "character"
    const val PLANET = "planet"
    const val STARSHIP = "starship"
    const val VEHICLE = "vehicle"

    val characters = intArrayOf(
        R.drawable.placeholder, R.drawable.characters_1, R.drawable.characters_2,
        R.drawable.characters_3, R.drawable.characters_4, R.drawable.characters_5,
        R.drawable.characters_6, R.drawable.characters_7, R.drawable.characters_8,
        R.drawable.characters_9, R.drawable.characters_10, R.drawable.characters_11,
        R.drawable.characters_12, R.drawable.characters_13, R.drawable.characters_14,
        R.drawable.characters_15, R.drawable.characters_16, R.drawable.placeholder,
        R.drawable.characters_18, R.drawable.characters_19, R.drawable.characters_20,
        R.drawable.characters_21, R.drawable.characters_22, R.drawable.characters_23,
        R.drawable.characters_24, R.drawable.characters_25, R.drawable.characters_26,
        R.drawable.characters_27, R.drawable.characters_28, R.drawable.characters_29,
        R.drawable.characters_30, R.drawable.characters_31, R.drawable.characters_32,
        R.drawable.characters_33, R.drawable.characters_34, R.drawable.characters_35,
        R.drawable.characters_36, R.drawable.characters_37, R.drawable.characters_38,
        R.drawable.characters_39, R.drawable.characters_40, R.drawable.characters_41,
        R.drawable.characters_42, R.drawable.characters_43, R.drawable.characters_44,
        R.drawable.characters_45, R.drawable.characters_46, R.drawable.characters_47,
        R.drawable.characters_48, R.drawable.characters_49, R.drawable.characters_50,
        R.drawable.characters_51, R.drawable.characters_52, R.drawable.characters_53,
        R.drawable.characters_54, R.drawable.characters_55, R.drawable.characters_56,
        R.drawable.characters_57, R.drawable.characters_58, R.drawable.characters_59,
        R.drawable.characters_60, R.drawable.characters_61, R.drawable.characters_62,
        R.drawable.characters_63, R.drawable.characters_64, R.drawable.characters_65,
        R.drawable.characters_66, R.drawable.characters_67, R.drawable.characters_68,
        R.drawable.characters_69, R.drawable.characters_70, R.drawable.characters_71,
        R.drawable.characters_72, R.drawable.characters_73, R.drawable.characters_74,
        R.drawable.characters_75, R.drawable.characters_76, R.drawable.characters_77,
        R.drawable.characters_78, R.drawable.characters_79, R.drawable.characters_80,
        R.drawable.characters_81, R.drawable.characters_82, R.drawable.characters_83,
        R.drawable.characters_84, R.drawable.characters_85, R.drawable.characters_86,
        R.drawable.characters_87, R.drawable.characters_88
    )
    val films = intArrayOf(
        R.drawable.placeholder, R.drawable.films_1, R.drawable.films_2,
        R.drawable.films_3, R.drawable.films_4, R.drawable.films_5,
        R.drawable.films_6, R.drawable.films_7
    )
    val planets = intArrayOf(
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.planets_2,
        R.drawable.planets_3, R.drawable.planets_4, R.drawable.planets_5,
        R.drawable.planets_6, R.drawable.planets_7, R.drawable.planets_8,
        R.drawable.planets_9, R.drawable.planets_10, R.drawable.planets_11,
        R.drawable.planets_12, R.drawable.planets_13, R.drawable.planets_14,
        R.drawable.planets_15, R.drawable.planets_16, R.drawable.placeholder,
        R.drawable.planets_18, R.drawable.planets_19, R.drawable.placeholder,
        R.drawable.planets_21
    )
    val species = intArrayOf(
        R.drawable.placeholder, R.drawable.species_1, R.drawable.species_2,
        R.drawable.species_3, R.drawable.species_4, R.drawable.species_5,
        R.drawable.species_6, R.drawable.species_7, R.drawable.species_8,
        R.drawable.species_9, R.drawable.species_10, R.drawable.species_11,
        R.drawable.species_12, R.drawable.species_13, R.drawable.species_14,
        R.drawable.species_15, R.drawable.species_16, R.drawable.species_17,
        R.drawable.species_18, R.drawable.species_19, R.drawable.species_20,
        R.drawable.species_21, R.drawable.species_22, R.drawable.species_23,
        R.drawable.species_24, R.drawable.species_25, R.drawable.species_26,
        R.drawable.species_27, R.drawable.species_28, R.drawable.species_29,
        R.drawable.species_30, R.drawable.species_31, R.drawable.species_32,
        R.drawable.species_33, R.drawable.species_34, R.drawable.species_35,
        R.drawable.species_36, R.drawable.species_37, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.species_79
    )
    val starships = intArrayOf(
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.starships_5,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.starships_9, R.drawable.starships_10, R.drawable.starships_11,
        R.drawable.starships_12, R.drawable.starships_13, R.drawable.placeholder,
        R.drawable.starships_15, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.starships_21, R.drawable.starships_22, R.drawable.starships_23,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.starships_27, R.drawable.starships_28, R.drawable.starships_29,
        R.drawable.placeholder, R.drawable.starships_31, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.starships_39, R.drawable.starships_40, R.drawable.starships_41,
        R.drawable.placeholder, R.drawable.starships_43, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.starships_47,
        R.drawable.starships_48
    )
    val vehicles = intArrayOf(
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.vehicles_4, R.drawable.placeholder,
        R.drawable.vehicles_6, R.drawable.vehicles_7, R.drawable.vehicles_8,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.vehicles_14,
        R.drawable.placeholder, R.drawable.vehicles_16, R.drawable.placeholder,
        R.drawable.vehicles_18, R.drawable.vehicles_19, R.drawable.vehicles_20,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.vehicles_24, R.drawable.vehicles_25, R.drawable.vehicles_26,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.vehicles_30, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.vehicles_33, R.drawable.vehicles_34, R.drawable.vehicles_35,
        R.drawable.vehicles_36, R.drawable.vehicles_37, R.drawable.vehicles_38,
        R.drawable.placeholder, R.drawable.placeholder, R.drawable.placeholder,
        R.drawable.vehicles_42
    )

    fun getDrawableId(category: String, id: Int): Int {
        return try {
            when (category) {
                CHARACTER -> characters[id]
                PLANET -> planets[id]
                STARSHIP -> starships[id]
                VEHICLE -> vehicles[id]
                else -> R.drawable.placeholder
            }
        } catch (e: ArrayIndexOutOfBoundsException) {
            R.drawable.placeholder
        }
    }
}


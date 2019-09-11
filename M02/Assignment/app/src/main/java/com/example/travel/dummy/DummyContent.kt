package com.example.travel.dummy

import com.example.travel.model.*
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */

/**

 * Helper class for providing sample content for user interfaces created by

 * Android template wizards.

 *

 * TODO: Replace all uses of this class before publishing your app.

 */

object VehicleList {



    val ITEMS: MutableList<Vehicle> = ArrayList()

    val ITEM_MAP: MutableMap<String, Vehicle> = HashMap()



    init {

        ITEMS.add(SpeedBoat("Boat",

            "4000",

            false))

        ITEMS.add(SpeedBoat("Sailboat",

            "12500",

            false))

        ITEMS.add(
            Car("Car",

            "4 passanger",

            true)
        )

        ITEMS.add(
            Plane("Airplane",

            "90000",

            true)
        )

        ITEMS.add(Car("Tesla",

            "2 door",

            true))

        ITEMS.add(
            Helicopter("Helicopter",

            "17000",

            false)
        )







        ITEM_MAP[ITEMS[0].id] = ITEMS[0]

        ITEM_MAP[ITEMS[1].id] = ITEMS[1]

        ITEM_MAP[ITEMS[2].id] = ITEMS[2]

        ITEM_MAP[ITEMS[3].id] = ITEMS[3]

        ITEM_MAP[ITEMS[4].id] = ITEMS[4]

        ITEM_MAP[ITEMS[5].id] = ITEMS[5]

    }

    /*

    /**

     * A map of sample (dummy) items, by ID.

     */

    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()



    private val COUNT = 25



    init {

        // Add some sample items.

        for (i in 1..COUNT) {

            addItem(createDummyItem(i))

        }

    }



    private fun addItem(item: DummyItem) {

        ITEMS.add(item)

        ITEM_MAP.put(item.id, item)

    }



    private fun createDummyItem(position: Int): DummyItem {

        return DummyItem(position.toString(), "Item " + position, makeDetails(position))

    }



    private fun makeDetails(position: Int): String {

        val builder = StringBuilder()

        builder.append("Details about Item: ").append(position)

        for (i in 0..position - 1) {

            builder.append("\nMore details information here.")

        }

        return builder.toString()

    }



    /**

     * A dummy item representing a piece of content.

     */

    data class DummyItem(val id: String, val content: String, val details: String) {

        override fun toString(): String = content

    }



     */

}

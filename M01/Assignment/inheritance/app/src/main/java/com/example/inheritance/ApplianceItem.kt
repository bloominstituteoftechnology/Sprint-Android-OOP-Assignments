package com.example.inheritance

class ApplianceItem(val applianceName: String, val numWatts: Double) : ShoppingItem(3, applianceName) {
    override fun getDisplayName(): String {
        return "${super.getDisplayName()}\n${numWatts} watts"
    }
}
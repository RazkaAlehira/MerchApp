package com.example.merchapp.data

class ProductData {

    fun allProducts(): List<FoodItem> {

        val foodItem = listOf (
            FoodItem("Futurekid950", "The Future Kid's Merch", 56.78, "It's Make Your Comfort...", true)
        )

        return foodItem
    }
}
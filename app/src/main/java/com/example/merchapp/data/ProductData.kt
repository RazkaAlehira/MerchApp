package com.example.merchapp.data

import com.example.merchapp.R

class ProductData {

    fun allProducts(): List<FoodItem> {

        val foodItem = listOf (
            FoodItem("Futurekid950", "The Future Kid's Merch", 56.78, "It's Make Your Comfort...", true, R.drawable.mymerch)
        )

        return foodItem
    }
}
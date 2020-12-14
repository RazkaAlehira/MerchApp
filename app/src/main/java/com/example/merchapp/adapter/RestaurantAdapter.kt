package com.example.merchapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.merchapp.R
import com.example.merchapp.data.FoodItem

class RestaurantAdapter(private val foodItems: List<FoodItem>) : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.a_single_restaurant_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodItem = foodItems[position]
        holder.bind(foodItem)
    }

    override fun getItemCount() = foodItems.size

    class ViewHolder(view: View) :RecyclerView.ViewHolder(view) {

        fun bind(foodItem: FoodItem) {
            itemView.txt_title.text = foodItem.name
            itemView.txt_price.text = "Price: $ ${foodItem.price}"
        }

    }

}
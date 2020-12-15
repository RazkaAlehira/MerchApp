package com.example.merchapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.merchapp.adapter.RestaurantAdapter
import com.example.merchapp.data.FoodItem
import com.example.merchapp.data.ProductData
import com.example.merchapp.databinding.FragmentFirstBinding


class  FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val foodItems = ProductData().allProducts()

        binding.rvRestaurant.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = RestaurantAdapter(foodItems)
        }
    }
}
package com.example.merchapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.merchapp.data.ProductData
import kotlinx.android.synthetic.main.fragment_product_info.*


class ProductInformationFragment : Fragment() {


    private val productCodeArgument: CharSequence?
        get() {
            TODO()
        }
    private val args: ProductInformationFragment by navArgs()


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_product_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val productCode = args.productCodeArgument
        val product = ProductData().allProducts().find {
            it.productCode == productCode
        }

        if (product != null) {
            txt_product_title.text = product.name
            txt_product_description.text = product.description
        }
    }
}
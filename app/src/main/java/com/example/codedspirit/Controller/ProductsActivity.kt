package com.example.codedspirit.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import com.example.codedspirit.Adapter.ProductsAdapters
import com.example.codedspirit.R
import com.example.codedspirit.Services.DataService
import com.example.codedspirit.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductsAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)


        val categoryTypr = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapters(this,DataService.getProducts(categoryTypr))

        val layoutManager = GridLayoutManager(this,2)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter



    }


}

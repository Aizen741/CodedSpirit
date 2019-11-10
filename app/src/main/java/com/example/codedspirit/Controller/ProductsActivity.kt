package com.example.codedspirit.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.codedspirit.R
import com.example.codedspirit.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)


        val categoryTypr = intent.getStringExtra(EXTRA_CATEGORY)
        
    }


}

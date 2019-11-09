package com.example.codedspirit.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.codedspirit.Adapter.CategoryAdapter
import com.example.codedspirit.R
import com.example.codedspirit.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Adapter is used to send the data stored in the data service to  the list view, which manages it and show it on the UI


    lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

    }
}

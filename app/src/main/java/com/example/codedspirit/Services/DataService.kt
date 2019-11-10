package com.example.codedspirit.Services

import com.example.codedspirit.Model.Category
import com.example.codedspirit.Model.Product

object DataService
{
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie","$18","hat1"),
        Product("Black Hat","$20","hat2"),
        Product("White Hat","$18","hat3"),
        Product("Snapback Hat","$22","hat4")
    )
    val hoodies = listOf(
        Product("Gray Hoodie","$28","hoodie1"),
        Product("Red Hoodie","$22","hoodie2"),
        Product("Devslopes GrayHoodie","$23","hoodie3"),
        Product("Black Hoodie","$32","hoodie4")
    )
    val shirts = listOf(
        Product("Black Shirt","$28","shirt1"),
        Product("Badge Light Grey","$30","shirt2"),
        Product("Hustle","$38","shirt03"),
        Product("Kickflip Studios","$22","shirt4")
    )
}
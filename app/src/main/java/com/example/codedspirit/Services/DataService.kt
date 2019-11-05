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
        Product("Graphic Beanie","$18","hat01"),
        Product("Black Hat","$20","hat02"),
        Product("White Hat","$18","hat03"),
        Product("Snapback Hat","$22","hat04")
    )
    val hoodies = listOf(
        Product("Gray Hoodie","$28","hoodie01"),
        Product("Red Hoodie","$22","hoodie02"),
        Product("Devslopes GrayHoodie","$23","hoodie03"),
        Product("Black Hoodie","$32","hoodie04")
    )
    val shirts = listOf(
        Product("Black Shirt","$28","shirt01"),
        Product("Badge Light Grey","$30","shirt02"),
        Product("Hustle","$38","shirt03"),
        Product("Kickflip Studios","$22","shirt04")
    )
}
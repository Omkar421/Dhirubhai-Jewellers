package com.example.dhirubhaijewellers.model

import com.example.dhirubhaijewellers.R


data class JewelryItem(
    val id: Int,
    val name: String,
    val category: String,
    val price: String,
    val description: String,
    val imageRes: Int // Using local drawables
)

object LocalDataSource {
    val items = listOf(
        JewelryItem(1, "Bridal Gold Necklace", "Gold", "₹1,45,000", "23k Pure Gold traditional bridal set.", R.drawable.gold),
        JewelryItem(2, "Diamond Stud Earrings", "Diamond", "₹85,000", "18k White Gold with VVS Diamonds.", R.drawable.diamond),
        JewelryItem(3, "Silver Kada", "Silver", "12,000", "Sterling Silver handcrafted mens kada.", R.drawable.silver),
        JewelryItem(4, "Kundan Set", "Silver", "96,300", "Sterling Silver handcrafted womens kundan set.", R.drawable.silver_kundan),
        JewelryItem(5, "AD Set", "Silver", "15,000", "Sterling Silver handcrafted womens AD set.", R.drawable.silver_ad),
        JewelryItem(6, "Full Bridal Set", "Gold", "3,00,000", "22k Pure Gold traditional bridal set.", R.drawable.gold_full)

    )
}
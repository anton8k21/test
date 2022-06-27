package com.example.test.homeScreen.data.model

data class CardBestSeller(
    val id: Long,
    val isFavorite: Boolean,
    val title: String,
    val priceWithoutDiscount: Int,
    val discountPrice: Int,
    val picture: String
) {
}
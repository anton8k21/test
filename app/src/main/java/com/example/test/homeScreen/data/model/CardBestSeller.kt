package com.example.test.homeScreen.data.model

import com.google.gson.annotations.SerializedName

data class CardBestSeller(
    val id: Long,
    val isFavorite: Boolean,
    val title: String,
    @SerializedName("price_without_discount")
    val priceWithoutDiscount: Int,
    @SerializedName("discount_price")
    val discountPrice: Int,
    val picture: String
) {
}
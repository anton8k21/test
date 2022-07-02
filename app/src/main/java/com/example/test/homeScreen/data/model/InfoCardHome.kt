package com.example.test.homeScreen.data.model

import com.google.gson.annotations.SerializedName

data class InfoCardHome(
    @SerializedName("home_store")
    val homeStore: List<CardHomeStore>,
    @SerializedName("best_seller")
    val bestSeller: List<CardBestSeller>
) {
}
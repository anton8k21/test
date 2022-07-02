package com.example.test.myCartScreen.data.model

data class MyCartModel(
    val basket: List<BasketModel>,
    val delivery: String,
    val id: Long,
    val total: Int
) {
}
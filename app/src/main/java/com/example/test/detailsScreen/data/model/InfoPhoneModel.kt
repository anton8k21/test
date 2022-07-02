package com.example.test.detailsScreen.data.model

data class InfoPhoneModel(
    val CPU: String,
    val camera: String,
    val capacity: List<Int>,
    val color: List<String>,
    val id: Long,
    val images: List<String>,
    val isFavorites: Boolean,
    val price: Int,
    val rating: Double,
    val sd: String,
    val ssd: String,
    val title: String
) {
}
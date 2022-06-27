package com.example.test.homeScreen.data.model
data class CardHomeStore(
    val id: Long,
    val isNew: Boolean,
    val title: String,
    val subtitle: String,
    val picture: String,
    val isBuy: Boolean
) {
}
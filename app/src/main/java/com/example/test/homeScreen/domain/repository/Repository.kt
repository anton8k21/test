package com.example.test.homeScreen.domain.repository

interface Repository {

    fun likes(id: Long)
    fun openCard(id:Long)
}
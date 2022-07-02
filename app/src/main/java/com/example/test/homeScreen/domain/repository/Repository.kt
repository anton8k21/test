package com.example.test.homeScreen.domain.repository

import com.example.test.homeScreen.data.ApiService.CardApiService
import com.example.test.homeScreen.data.model.CardBestSeller
import com.example.test.homeScreen.data.model.InfoCardHome
import retrofit2.Response

interface Repository {

    fun likes(id: Long)
   suspend fun getAll(): Response<InfoCardHome>
    fun getListLike(): List<CardBestSeller>
}
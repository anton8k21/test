package com.example.test.homeScreen.data.repository

import com.example.test.homeScreen.data.ApiService.CardApiService
import com.example.test.homeScreen.data.model.CardBestSeller
import com.example.test.homeScreen.data.model.InfoCardHome
import com.example.test.homeScreen.domain.repository.Repository
import retrofit2.Response


class RepositoryImpl(private val apiService: CardApiService): Repository {

    override fun likes(id: Long) {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(): Response<InfoCardHome> {
        return apiService.api.getCard()
    }

    override fun getListLike(): List<CardBestSeller> {
        TODO("Not yet implemented")
    }

}
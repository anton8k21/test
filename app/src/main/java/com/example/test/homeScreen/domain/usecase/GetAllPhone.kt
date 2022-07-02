package com.example.test.homeScreen.domain.usecase

import com.example.test.homeScreen.data.ApiService.CardApiService
import com.example.test.homeScreen.data.model.InfoCardHome
import com.example.test.homeScreen.domain.repository.Repository

class GetAllPhone(private val repository: Repository) {

    suspend fun getAllPhone(): InfoCardHome{
        val response = repository.getAll()
        return response.body() ?: throw Exception()
    }
}
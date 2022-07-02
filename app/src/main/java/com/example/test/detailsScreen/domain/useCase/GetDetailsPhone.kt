package com.example.test.detailsScreen.domain.useCase

import com.example.test.detailsScreen.data.model.InfoPhoneModel
import com.example.test.detailsScreen.domain.repositoryDetails.RepositoryDetails

class GetDetailsPhone(
    private val repositoryDetails: RepositoryDetails) {

    suspend fun get(): InfoPhoneModel{
        val response = repositoryDetails.getDetailPhone()
        return response.body() ?: throw Exception()
    }
}
package com.example.test.detailsScreen.data.repositoryDetailsImpl

import com.example.test.detailsScreen.data.CardApiService
import com.example.test.detailsScreen.data.model.InfoPhoneModel
import com.example.test.detailsScreen.domain.repositoryDetails.RepositoryDetails
import retrofit2.Response

class RepositoryDetailsImpl(
    private val apiService: CardApiService
    ): RepositoryDetails {
    override suspend fun getDetailPhone(): Response<InfoPhoneModel> {
        return apiService.api.getCard()
    }
}
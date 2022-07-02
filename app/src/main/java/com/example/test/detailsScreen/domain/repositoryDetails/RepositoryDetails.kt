package com.example.test.detailsScreen.domain.repositoryDetails

import com.example.test.detailsScreen.data.model.InfoPhoneModel
import retrofit2.Response

interface RepositoryDetails {
   suspend fun getDetailPhone(): Response<InfoPhoneModel>
}
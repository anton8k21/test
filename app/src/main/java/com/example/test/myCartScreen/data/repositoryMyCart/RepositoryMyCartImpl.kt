package com.example.test.myCartScreen.data.repositoryMyCart

import com.example.test.myCartScreen.ApiServiceMyCard
import com.example.test.myCartScreen.data.model.MyCartModel
import com.example.test.myCartScreen.domain.repositoryMyCart.RepositoryMyCart
import retrofit2.Response

class RepositoryMyCartImpl(
    private val apiService: ApiServiceMyCard): RepositoryMyCart {
    override suspend fun getMyCart(): Response<MyCartModel> {
        return apiService.api.getCard()
    }
}
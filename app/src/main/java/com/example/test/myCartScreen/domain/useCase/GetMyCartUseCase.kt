package com.example.test.myCartScreen.domain.useCase

import com.example.test.myCartScreen.data.model.MyCartModel
import com.example.test.myCartScreen.domain.repositoryMyCart.RepositoryMyCart

class GetMyCartUseCase(
    private val repository: RepositoryMyCart
    ) {

    suspend fun getMyCart(): MyCartModel{
        val response = repository.getMyCart()
        return response.body() ?: throw Exception()
    }
}
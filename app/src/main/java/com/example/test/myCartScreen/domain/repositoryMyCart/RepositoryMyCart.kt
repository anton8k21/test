package com.example.test.myCartScreen.domain.repositoryMyCart

import com.example.test.myCartScreen.data.model.MyCartModel
import retrofit2.Response

interface RepositoryMyCart {
    suspend fun getMyCart(): Response<MyCartModel>
}
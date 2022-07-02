package com.example.test.homeScreen.domain.usecase

import com.example.test.homeScreen.data.model.CardBestSeller
import com.example.test.homeScreen.domain.repository.Repository

class GetAllLike(private val repository: Repository) {

    fun getAllLike():List<CardBestSeller>{
        return repository.getListLike()
    }
}
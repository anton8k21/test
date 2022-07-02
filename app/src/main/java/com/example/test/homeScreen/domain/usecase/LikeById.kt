package com.example.test.homeScreen.domain.usecase

import com.example.test.homeScreen.domain.repository.Repository

class LikeById(private val repository: Repository) {

    fun likeById(id: Long){
        repository.likes(id = id)
    }
}
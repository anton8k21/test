package com.example.test.homeScreen.presentation.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.homeScreen.data.ApiService.CardApiService
import com.example.test.homeScreen.data.model.InfoCardHome
import kotlinx.coroutines.launch
import java.io.IOException

class ViewModel: ViewModel() {
    var data: MutableLiveData<InfoCardHome> = MutableLiveData()

    init {
        loadPosts()
    }

    private fun loadPosts() = viewModelScope.launch {
            val response = CardApiService.api.getCard()
            if (!response.isSuccessful) {
                Log.d("dddd", "Ошибка")
            }
            val body = response.body() ?: throw Exception()
        Log.d("AAAWWW", "$body")
            data.postValue(body)

    }
}
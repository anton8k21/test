package com.example.test.homeScreen.presentation.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.homeScreen.data.ApiService.CardApiService
import com.example.test.homeScreen.data.model.InfoCardHome
import com.example.test.homeScreen.data.repository.RepositoryImpl
import com.example.test.homeScreen.domain.repository.Repository
import com.example.test.homeScreen.domain.usecase.GetAllPhone
import kotlinx.coroutines.launch
import java.io.IOException

class ViewModel: ViewModel() {
    var data: MutableLiveData<InfoCardHome> = MutableLiveData()

    private val repository by lazy {
        RepositoryImpl(CardApiService)
    }
 private val useCaseGetPhone by lazy {
     GetAllPhone(repository = repository)
 }

    init {
        loadPosts()
    }

    private fun loadPosts() = viewModelScope.launch {
        val dataHomeScreen = useCaseGetPhone.getAllPhone()
        data.postValue(dataHomeScreen)
    }
}
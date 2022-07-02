package com.example.test.detailsScreen.presentation

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.detailsScreen.data.CardApiService
import com.example.test.detailsScreen.data.model.InfoPhoneModel
import com.example.test.detailsScreen.data.repositoryDetailsImpl.RepositoryDetailsImpl
import com.example.test.detailsScreen.domain.useCase.GetDetailsPhone
import kotlinx.coroutines.launch

class ViewModelInfoScreen: ViewModel() {
        var data: MutableLiveData<InfoPhoneModel> = MutableLiveData()
    private val repositoryDetails by lazy {
        RepositoryDetailsImpl(CardApiService)
    }
    private val useCaseDetailsPhone by lazy {
        GetDetailsPhone(repositoryDetails)
    }

        init {
            loadPosts()
        }

        private fun loadPosts() = viewModelScope.launch {
            val infoCard = useCaseDetailsPhone.get()
            data.postValue(infoCard)

        }
    }

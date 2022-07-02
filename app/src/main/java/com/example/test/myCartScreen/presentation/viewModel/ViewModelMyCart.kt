package com.example.test.myCartScreen.presentation.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.myCartScreen.ApiServiceMyCard
import com.example.test.myCartScreen.data.model.MyCartModel
import com.example.test.myCartScreen.data.repositoryMyCart.RepositoryMyCartImpl
import com.example.test.myCartScreen.domain.useCase.GetMyCartUseCase
import kotlinx.coroutines.launch

class ViewModelMyCart: ViewModel() {
    var data: MutableLiveData<MyCartModel> = MutableLiveData()

    private val repositoryMyCart by lazy {
        RepositoryMyCartImpl(ApiServiceMyCard)
    }

    private val getMyCartUseCase by lazy {
        GetMyCartUseCase(repositoryMyCart)
    }

    init {
        loadPosts()
    }

    private fun loadPosts() = viewModelScope.launch {
        val myCart = getMyCartUseCase.getMyCart()
        data.postValue(myCart)

    }
}

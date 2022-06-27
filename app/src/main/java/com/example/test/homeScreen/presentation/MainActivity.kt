package com.example.test.homeScreen.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.databinding.ActivityMainBinding
import com.example.test.homeScreen.presentation.adapter.CarouselAdapter
import com.example.test.homeScreen.presentation.viewModel.ViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel: ViewModel by viewModels()



        binding.constraint2.adapter = CarouselAdapter()
    }
}
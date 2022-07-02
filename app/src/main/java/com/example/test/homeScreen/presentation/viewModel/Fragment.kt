package com.example.test.homeScreen.presentation.viewModel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.test.databinding.FragmentFilterOptionsItemBinding

class Fragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFilterOptionsItemBinding.inflate(layoutInflater)

        binding.closeFilter.setOnClickListener{
            activity?.finish()
        }
        return binding.root
    }
}
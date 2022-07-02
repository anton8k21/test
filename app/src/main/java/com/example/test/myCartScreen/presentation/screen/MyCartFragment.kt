package com.example.test.myCartScreen.presentation.screen

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.databinding.FragmentMyCartScreenBinding
import com.example.test.myCartScreen.AdapterMyCard
import com.example.test.myCartScreen.presentation.viewModel.ViewModelMyCart

class MyCartFragment: Fragment() {
    val viewModel: ViewModelMyCart by activityViewModels()

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMyCartScreenBinding.inflate(layoutInflater)

        val crimeRecyclerView =
            binding.root.findViewById(R.id.list) as RecyclerView
        crimeRecyclerView.layoutManager = GridLayoutManager(context, 1)


        viewModel.data.observe(viewLifecycleOwner) {
            val adapterCarousel = AdapterMyCard(it.basket)
            binding.apply {
                list.adapter = adapterCarousel
                totalValue.text = "$" + it.total.toString()
                deliveryValue.text = it.delivery
            }
        }
            return binding.root
    }
}
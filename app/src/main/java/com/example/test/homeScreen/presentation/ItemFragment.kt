package com.example.test.homeScreen.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.R
import com.example.test.databinding.FragmentItemBinding
import com.example.test.databinding.FragmentItemListBinding
import com.example.test.homeScreen.presentation.adapter.CarouselAdapter
import com.example.test.homeScreen.presentation.placeholder.PlaceholderContent
import com.example.test.homeScreen.presentation.adapter.MyItemRecyclerViewAdapter
import com.example.test.homeScreen.presentation.viewModel.ViewModel


class ItemFragment : Fragment() {
private val viewModel: ViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentItemListBinding.inflate(layoutInflater)

        val crimeRecyclerView =
            binding.root.findViewById(R.id.list) as RecyclerView
        crimeRecyclerView.layoutManager = LinearLayoutManager(context)

        viewModel.data.observe(viewLifecycleOwner){
            val adapter = MyItemRecyclerViewAdapter(it.bestSeller)
        }
        return binding.root
    }

}
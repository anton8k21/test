package com.example.test.homeScreen.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


import com.example.test.databinding.FragmentItemBinding
import com.example.test.databinding.FragmentItemListBinding
import com.example.test.homeScreen.data.model.CardBestSeller
import com.example.test.homeScreen.presentation.placeholder.PlaceholderContent

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyItemRecyclerViewAdapter(
    private val values: List<CardBestSeller>
) : RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FragmentItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cardItem = values[position]
        holder.bind(cardItem)
    }

    override fun getItemCount() = values.size

}

class ViewHolder(
    private val binding: FragmentItemBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(bestSeller: CardBestSeller){
binding.apply {
    phonePrise.text = bestSeller.discountPrice.toString()
    phonePrise2.text = bestSeller.priceWithoutDiscount.toString()
    namePhone.text = bestSeller.title
}
    }

}
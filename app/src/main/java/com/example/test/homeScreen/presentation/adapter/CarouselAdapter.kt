package com.example.test.homeScreen.presentation.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.test.R
import com.example.test.databinding.CarouselHomeScreenItemBinding
import com.example.test.homeScreen.data.model.CardHomeStore

class CarouselAdapter (
    private val value: List<CardHomeStore>
        ): RecyclerView.Adapter<PagerVH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH{
        val binding = CarouselHomeScreenItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
return PagerVH(binding)
    }


    override fun getItemCount(): Int = value.size

    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        val position = value[position]
        holder.bind(position)
    }
}

class PagerVH(
    private val binding: CarouselHomeScreenItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(card: CardHomeStore){
            binding.apply {
                isNew.isVisible = card.isNew
                isNewText.isVisible = card.isNew
                Glide
                    .with(binding.root.context)
                    .load(card.picture)
                    .into(phoneImage)
            }
        }
}
package com.example.test.homeScreen.presentation.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.databinding.CarouselItemBinding

class CarouselAdapter: RecyclerView.Adapter<PagerVH>() {

    private val image = arrayOf(
        R.drawable.phone,
        R.drawable.phone
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH{
        val binding = CarouselItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
return PagerVH(binding)
    }


    override fun getItemCount(): Int = image.size

    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        val position = image[position]
        holder.bind(position)
    }
}

class PagerVH(
    private val binding: CarouselItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(image: Int){
            binding.phoneImage.setBackgroundResource(image)
        }
}
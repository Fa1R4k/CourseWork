package com.example.coursework.ui.home

import androidx.recyclerview.widget.RecyclerView
import com.example.coursework.databinding.RvTextItemBinding
import com.example.coursework.domain.CarParameters

class SelectCarParamsHolder(
    private val binding: RvTextItemBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(item: CarParameters) {
        binding.tvTitle.text = getName(item)
        binding.root.setOnClickListener { selectClick(item) }

    }

    private fun getName(item: CarParameters): String {
        return when (item) {
            is CarParameters.TypeCar -> item.type
            is CarParameters.ModelsCar -> item.model
            is CarParameters.CarColor -> item.color
            is CarParameters.CarBrand -> item.brand
        }
    }

    private fun selectClick(item: CarParameters) {
        when (item) {
            is CarParameters.TypeCar -> println()
            is CarParameters.ModelsCar -> println()
            is CarParameters.CarColor -> println()
            is CarParameters.CarBrand -> println()
        }
    }

}
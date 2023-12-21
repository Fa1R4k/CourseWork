package com.example.coursework.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coursework.databinding.RvTextItemBinding
import com.example.coursework.domain.CarParameters

class SelectCarsParamsAdapter(
) : RecyclerView.Adapter<SelectCarParamsHolder>() {

    private val selectedItem: MutableList<CarParameters> = mutableListOf()
    private lateinit var holder: SelectCarParamsHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectCarParamsHolder {
        val item = RvTextItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SelectCarParamsHolder(item)
    }

    override fun getItemCount(): Int = selectedItem.size

    override fun onBindViewHolder(holder: SelectCarParamsHolder, position: Int) {
        holder.onBind(selectedItem[position])
        this.holder = holder
    }

    fun setItems(newList: List<CarParameters>) {
        selectedItem.clear()
        selectedItem.addAll(newList)
        notifyDataSetChanged()
    }
}
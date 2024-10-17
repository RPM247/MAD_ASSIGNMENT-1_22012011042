package com.rpm24.mad_assignment_1_22012011042

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rpm24.mad_assignment_1_22012011042.databinding.PopularRvItemBinding

class PopularAdapter(var dataList:ArrayList<Recipe>, var Context: Context):RecyclerView.Adapter<PopularAdapter.ViewHolder>() {
    inner class ViewHolder(var binding: PopularRvItemBinding):RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var  binding = PopularRvItemBinding.inflate(LayoutInflater.from(Context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.popularImg1
        holder.binding.popularText1
        holder.binding.popularTime1
    }
}
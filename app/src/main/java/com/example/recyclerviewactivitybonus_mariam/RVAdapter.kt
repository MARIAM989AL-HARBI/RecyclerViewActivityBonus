package com.example.recyclerviewactivitybonus_mariam

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewactivitybonus_mariam.databinding.ItemRowBinding

class RVAdapter (val arraylist: ArrayList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {
    class ViewHolder (val binding : ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = arraylist[position]

        holder.binding.apply {
            textView2.text = item
        }
    }

    override fun getItemCount(): Int = arraylist.size

}

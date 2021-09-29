package com.example.rcvtask3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_item.view.*


class Myadapter(private val foods: ArrayList<String>) : RecyclerView.Adapter<Myadapter.itemViewHolder>() {
    class itemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        return itemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.single_item
                , parent
                , false
            )
        )

    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val name = foods[position]
        holder.itemView.apply {
            tv.text=name
        }
    }

    override fun getItemCount() = foods.size
}

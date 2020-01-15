package com.armanco.test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cardlist_items.view.*

class ItemsAdapter(val context : Context, val items : List<ItemModel>) :
    RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cardlist_items, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemsAdapter.ViewHolder, position: Int) {
        val item = items[position]
        holder.setData(item, position)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentItem : ItemModel? = null
        var currentPosition : Int? = null

        init {
            itemView.setOnClickListener {
                Toast.makeText(context, currentItem!!.title, Toast.LENGTH_SHORT).show()
            }
        }
        fun setData(item: ItemModel?, position : Int) {
            itemView.cvTitle.text = item!!.title
            this.currentItem = item
            this.currentPosition = position
        }
    }


}
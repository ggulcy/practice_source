package com.example.androiduipractice.UI.Recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androiduipractice.R
import kotlinx.android.synthetic.main.item_list.view.*


class ListAdapter constructor() : RecyclerView.Adapter<ListAdapter.CustomViewHolder>() {

    var collection:List<ListItem> = emptyList()
    set(value) {
        value.let {
            field = value
            this.notifyDataSetChanged()
        }
    }

    var onItemClick:((item:ListItem) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder = CustomViewHolder(parent)


    override fun getItemCount(): Int = collection.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val data = collection[position]
        holder.apply {
            itemView.setOnClickListener {
                onItemClick?.invoke(data)
            }

            with(data){
                tvTitle.text = title
                tvContent.text = content
            }
        }
    }


    fun addItem(list:MutableList<ListItem>) {
        collection = collection.plus(list)
    }

    inner class CustomViewHolder(parent:ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)){
        val tvTitle = itemView.title
        val tvContent = itemView.content
    }




}
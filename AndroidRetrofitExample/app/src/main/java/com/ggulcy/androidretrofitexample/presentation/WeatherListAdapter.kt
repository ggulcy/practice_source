package com.ggulcy.androidretrofitexample.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ggulcy.androidretrofitexample.R
import com.ggulcy.androidretrofitexample.domain.City
import kotlinx.android.synthetic.main.item_city_list.view.*

class WeatherListAdapter constructor() :
    RecyclerView.Adapter<WeatherListAdapter.CustomViewHolder>() {

    var collection: List<City> = emptyList()
        set(value) {
            value.let {
                field = value
                this.notifyDataSetChanged()
            }
        }

    var onItemClick: ((item: City) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =
        CustomViewHolder(parent)


    override fun getItemCount(): Int = collection.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val data = collection[position]
        holder.apply {
            itemView.setOnClickListener {
                onItemClick?.invoke(data)
            }
            with(data) {
                tvCity.text = "<${this.name}> 의 날씨를 확인합니다"
            }
        }
    }


    fun addItem(list: MutableList<City>) {
        collection = collection.plus(list)
    }

    inner class CustomViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_city_list, parent, false)
    ) {
        val tvCity = itemView.tv_city
    }


}

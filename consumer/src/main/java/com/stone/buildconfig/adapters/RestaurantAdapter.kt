package com.stone.buildconfig.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stone.buildconfig.viewholders.RestaurantViewHolder
import com.stone.consumer.R
import com.stone.shared.data.vo.RestaurantVO

class RestaurantAdapter: RecyclerView.Adapter<RestaurantViewHolder>() {
    private var mData :List<RestaurantVO> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant,parent,false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        if (mData.isNotEmpty()){
            holder.bindData(mData[position])
        }
    }

    override fun getItemCount(): Int {
        return mData.size
    }


    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(restaurants:List<RestaurantVO>){
        mData = restaurants
        notifyDataSetChanged()
    }
}
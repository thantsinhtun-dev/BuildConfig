package com.stone.buildconfig.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.stone.consumer.R
import com.stone.shared.data.vo.RestaurantVO
import kotlinx.android.synthetic.main.item_restaurant.view.*


class RestaurantViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
    fun bindData(data:RestaurantVO){
        itemView.tvRestaurantName.text = data.name
        itemView.tvCategory.text = data.category
        itemView.tvDeliveryPrice.text = "${data.deliveryPrice} Ks"
        itemView.tvRate.text = data.rating.toString()

        Glide.with(itemView.context)
            .load(data.image)
            .placeholder(R.drawable.sample)
            .into(itemView.ivRestaurantCover)


    }
}
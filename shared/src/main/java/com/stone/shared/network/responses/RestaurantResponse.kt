package com.stone.shared.network.responses

import com.google.gson.annotations.SerializedName
import com.stone.shared.data.vo.RestaurantVO

data class RestaurantResponse(
    @SerializedName("code")
    val code:String,
    @SerializedName("data")
    val data:List<RestaurantVO>?
)
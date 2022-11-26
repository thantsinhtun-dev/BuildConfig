package com.stone.shared.data.model

import com.stone.shared.data.vo.RestaurantVO

interface RestaurantModel {
    fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onError: (String) -> Unit
    )
}
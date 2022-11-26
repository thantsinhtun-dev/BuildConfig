package com.stone.shared.mvp.view

import com.stone.shared.data.vo.RestaurantVO

interface MainView {
    fun showRestaurants(restaurants:List<RestaurantVO>)
    fun showError(error:String)
}
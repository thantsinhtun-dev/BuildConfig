package com.stone.shared.network.api

import com.stone.shared.network.responses.RestaurantResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface RestaurantApi {
    @GET(END_POINT_RESTAURANT)
    fun getRestaurant():Observable<RestaurantResponse>
}
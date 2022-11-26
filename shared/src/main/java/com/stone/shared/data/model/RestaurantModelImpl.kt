package com.stone.shared.data.model

import com.stone.shared.data.vo.RestaurantVO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

object RestaurantModelImpl: BaseModel(),RestaurantModel {

    override fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onError: (String) -> Unit
    ) {
        mRestaurantApi.getRestaurant()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                       onSuccess(it.data ?: listOf())
            },{
                onError(it.localizedMessage ?: "")
            })
    }
}
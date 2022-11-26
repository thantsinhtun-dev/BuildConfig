package com.stone.buildconfig

import android.app.Application
import com.stone.shared.data.model.RestaurantModelImpl
import com.stone.shared.network.api.BASE_URL

class ConsumerApp: Application() {
    override fun onCreate() {
        super.onCreate()
        RestaurantModelImpl.initRetrofitBasedUrl(BASE_URL)
    }
}
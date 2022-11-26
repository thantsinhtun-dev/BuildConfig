package com.stone.buildconfig

import android.app.Application
import com.stone.consumer.BuildConfig
import com.stone.shared.data.model.RestaurantModelImpl

class ConsumerApp: Application() {
    override fun onCreate() {
        super.onCreate()
        RestaurantModelImpl.initRetrofitBasedUrl(BuildConfig.ENDPOINT_FIELD)
    }
}
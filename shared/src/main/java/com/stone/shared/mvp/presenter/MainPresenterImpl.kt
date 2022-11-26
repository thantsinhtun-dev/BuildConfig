package com.stone.shared.mvp.presenter

import androidx.lifecycle.ViewModel
import com.stone.shared.data.model.RestaurantModel
import com.stone.shared.data.model.RestaurantModelImpl
import com.stone.shared.mvp.view.MainView

class MainPresenterImpl:MainPresenter,ViewModel() {

    var mView : MainView? =null
    private  val mRestaurantModel:RestaurantModel = RestaurantModelImpl
    override fun initPresenter(view: MainView) {
        mView = view
    }

    override fun onUiReady() {
        mRestaurantModel.getRestaurants(
            onSuccess = {
                mView?.showRestaurants(it)
            },
            onError = {
                mView?.showError(it)
            }
        )
    }
}
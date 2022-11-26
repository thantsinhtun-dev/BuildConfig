package com.stone.shared.mvp.presenter

import com.stone.shared.mvp.view.MainView

interface MainPresenter {
    fun initPresenter(view:MainView)
    fun onUiReady()
}
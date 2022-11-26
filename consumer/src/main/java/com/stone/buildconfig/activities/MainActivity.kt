package com.stone.buildconfig.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import com.stone.buildconfig.R
import com.stone.buildconfig.adapters.RestaurantAdapter
import com.stone.shared.data.vo.RestaurantVO
import com.stone.shared.mvp.presenter.MainPresenter
import com.stone.shared.mvp.presenter.MainPresenterImpl
import com.stone.shared.mvp.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainView {
    private val mAdapter :RestaurantAdapter = RestaurantAdapter()
    private lateinit var mPresenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpToolBar()
        setUpPresenter()
        setUpRecyclerView()

        mPresenter.onUiReady()
    }

    private fun setUpRecyclerView() {
        rvRestaurants.adapter = mAdapter
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this)[MainPresenterImpl::class.java]
        mPresenter.initPresenter(this)
    }

    private fun setUpToolBar() {
        actionBar?.title =  getString(R.string.app_name)
    }

    override fun showRestaurants(restaurants: List<RestaurantVO>) {
        mAdapter.setNewData(restaurants)
    }

    override fun showError(error: String) {
        Snackbar.make(this.window.decorView,error,Snackbar.LENGTH_SHORT).show()
    }


}
package com.stone.rider.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stone.rider.R

class RestaurantActivity : AppCompatActivity() {
    companion object{
        fun getIntent(context: Context):Intent{
            return  Intent(context, RestaurantActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resturant)
    }
}
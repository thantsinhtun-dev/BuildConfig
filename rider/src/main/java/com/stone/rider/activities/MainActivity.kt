package com.stone.rider.activities

import android.app.PendingIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.stone.rider.R
import com.stone.rider.sendNotification

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            Log.i("firebase_token",it.result)
        }

//        sendNotification(this, "this is body", "title",
//        pendingIntent = PendingIntent.getActivity(
//            this,
//            0,
//            RestaurantActivity.getIntent(this),
//            PendingIntent.FLAG_IMMUTABLE
//        ))
    }
}
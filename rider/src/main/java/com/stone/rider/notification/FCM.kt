package com.stone.rider.notification

import android.app.PendingIntent
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.stone.rider.activities.RestaurantActivity
import com.stone.rider.sendNotification

class FCM : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("Firebase-token=======>", token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        sendNotification(
            context = this,
            title = message.data["title"] ?: "",
            body = message.data["body"] ?: "",
            pendingIntent = PendingIntent.getActivity(
                this, 0, RestaurantActivity.getIntent(this),PendingIntent.FLAG_IMMUTABLE
            )
        )
    }
}
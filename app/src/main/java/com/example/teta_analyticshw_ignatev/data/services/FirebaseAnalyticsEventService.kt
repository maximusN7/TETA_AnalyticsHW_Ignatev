package com.example.teta_analyticshw_ignatev.data.services

import android.content.Context
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class FirebaseAnalyticsEventService(context: Context) : EventService {
    private val firebaseAnalytics = FirebaseAnalytics.getInstance(context)

    override fun sendEvent(eventName: String) {
        val bundle = Bundle()
        firebaseAnalytics.logEvent(eventName, bundle)
    }

    override fun selectUserId(id: String) {
        firebaseAnalytics.setUserId(id)
    }
}
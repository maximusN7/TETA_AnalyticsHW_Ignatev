package com.example.teta_analyticshw_ignatev.data.services

import android.content.Context
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import com.yandex.metrica.YandexMetrica

class YandexAnalyticsEventService : EventService {

    override fun sendEvent(eventName: String) {
        YandexMetrica.reportEvent(eventName)
    }

    override fun selectUserId(id: String) {
        YandexMetrica.setUserProfileID(id)
    }
}
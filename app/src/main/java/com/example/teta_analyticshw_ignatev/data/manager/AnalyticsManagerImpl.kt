package com.example.teta_analyticshw_ignatev.data.manager

import android.content.Context
import com.example.teta_analyticshw_ignatev.data.services.FirebaseAnalyticsEventService
import com.example.teta_analyticshw_ignatev.data.services.YandexAnalyticsEventService

internal class AnalyticsManagerImpl(context: Context) : AnalyticsManager {

    private val firebaseAnalyticsEventService = FirebaseAnalyticsEventService(context)
    private val yandexAnalyticsEventService = YandexAnalyticsEventService()

    override fun sendEvent(eventName: String) {
        firebaseAnalyticsEventService.sendEvent(eventName)
        yandexAnalyticsEventService.sendEvent(eventName)
    }

    override fun selectUserId(id: String?) {
        val userId = id ?: NO_USER_ID

        firebaseAnalyticsEventService.selectUserId(userId)
        yandexAnalyticsEventService.selectUserId(userId)
    }

    companion object {
        const val NO_USER_ID = "Unknown user"
    }
}
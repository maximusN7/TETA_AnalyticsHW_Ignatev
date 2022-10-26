package com.example.teta_analyticshw_ignatev.data.manager

interface AnalyticsManager {
    fun sendEvent(eventName: String)
    fun selectUserId(id: String?)
}
package com.example.teta_analyticshw_ignatev.data.services

import android.content.Context

interface EventService {
    fun sendEvent(eventName: String)
    fun selectUserId(id: String)
}
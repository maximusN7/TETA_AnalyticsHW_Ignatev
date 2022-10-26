package com.example.teta_analyticshw_ignatev

import android.app.Application
import com.google.firebase.FirebaseApp
import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig

class App : Application() {

    private val YANDEXMETRICA_ID = "c71032dd-b2b8-42ca-86cd-4e3b6dd2511b"

    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(this)

        YandexMetrica.activate(applicationContext, YandexMetricaConfig.newConfigBuilder(YANDEXMETRICA_ID).build())
        YandexMetrica.enableActivityAutoTracking(this)
    }
}
package com.example.teta_analyticshw_ignatev.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teta_analyticshw_ignatev.data.manager.AnalyticsManager
import com.example.teta_analyticshw_ignatev.data.manager.AnalyticsManagerImpl
import com.example.teta_analyticshw_ignatev.databinding.ActivityMainBinding
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val analyticsManager: AnalyticsManager = AnalyticsManagerImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setClickListeners()
    }

    private fun setClickListeners() {
        binding.apply {
            buttonLogin.setOnClickListener {
                analyticsManager.selectUserId("Test User")
            }

            buttonLogout.setOnClickListener {
                analyticsManager.selectUserId(null)
            }

            buttonEvent.setOnClickListener {
               analyticsManager.sendEvent("event_button")
            }

            buttonCrash.setOnClickListener {
                throw RuntimeException("Test Crash from button")
            }
        }
    }
}
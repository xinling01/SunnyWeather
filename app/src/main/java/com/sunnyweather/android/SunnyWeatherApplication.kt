package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 *作者：linger
 *功能：
 *创建日期：2024/4/28
 */
class SunnyWeatherApplication:Application() {
    companion object{
        const val TOKEN = "klhuFXN4ewIVAwwd"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext

    }
}
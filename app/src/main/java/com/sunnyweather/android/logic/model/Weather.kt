package com.sunnyweather.android.logic.model

/**
 *作者：linger
 *功能：
 *创建日期：2024/5/7
 */
data class Weather(val realtime: RealtimeResponse.Realtime,val daily: DailyResponse.Daily)

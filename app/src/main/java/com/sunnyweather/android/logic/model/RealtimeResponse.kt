package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName
import retrofit2.http.Query

/**
 *作者：linger
 *功能：
 *创建日期：2024/5/5
 */
data class RealtimeResponse(val status: String,val result: Result){
    data class Result(val realtime: Realtime)
    data class Realtime(val skycon: String,val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality)
    data class AirQuality(val aqi: Aqi)
    data class Aqi(val chn:Float)
}

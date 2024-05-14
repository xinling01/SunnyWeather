package com.sunnyweather.android.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.model.Location

/**
 *作者：linger
 *功能：
 *创建日期：2024/5/7
 */
class WeatherViewModel:ViewModel() {
    private val locationLiveData = MutableLiveData<Location>()
    var locationLng = ""
    var locationLat = ""
    var placeName = ""
    val weatherLiveData = locationLiveData.switchMap {location ->
        Repository.refreshWeather(location.lng,location.lat)
    }
    fun refreshWeather(lng: String,lat: String){
        locationLiveData.value=Location(lng,lat)
    }
}
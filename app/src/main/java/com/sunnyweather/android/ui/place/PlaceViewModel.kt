package com.sunnyweather.android.ui.place


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.model.Place

/**
 *作者：linger
 *功能：
 *创建日期：2024/4/29
 */
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()
    val placeList = ArrayList<Place>()
    val placeLiveData = searchLiveData.switchMap { query ->
        Repository.searchPlaces(query) }
    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
    fun savePlace(place: Place)=Repository.savePlace(place)
    fun getSavedPlace() = Repository.getSavedPlace()
    fun isPlaceSaved() = Repository.isPlaceSaved()
}
package com.sunnyweather.android.logic.model


import com.google.gson.annotations.SerializedName

/**
 *作者：linger
 *功能：
 *创建日期：2024/4/28
 */
/**
 * 在 Kotlin 中定义数据模型时，可以使用 @SerializedName 注解来指定 JSON 字段的名称，从而解决 JSON 字段命名和 Kotlin 命名规范不一致的问题。
 * @SerializedName 注解是在 Gson 序列化和反序列化时使用的，它可以把 JSON 数据中的字段名映射为 Kotlin 中的属性名。
 */
data class PlaceResponse(val status:String,
                    val places:List<Place>)

data class Place(val name: String,
            val location: Location,
            @SerializedName("formatted_address") val address: String)

data class Location(val lng: String,
               val lat: String)
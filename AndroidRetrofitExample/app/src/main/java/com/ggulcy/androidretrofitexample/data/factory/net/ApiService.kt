package com.ggulcy.androidretrofitexample.data.factory.net

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService{
    @GET("getVilageFcst")
    fun getWeather(
        @Query("serviceKey",encoded = true) serviceKey:String,
        @Query("dataType") dataType:String,
        @Query("numOfRows") numOfRows:Int,
        @Query("pageNo") pageNo:Int,
        @Query("base_date") base_date : String,
        @Query("base_time") base_time : String,
        @Query("nx") nx:String?,
        @Query("ny") ny:String?
    ):Call<WeatherResponse>
}
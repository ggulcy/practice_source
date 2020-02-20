package com.ggulcy.androidretrofitexample.data.repository

import android.content.Context
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData
import com.ggulcy.androidretrofitexample.data.factory.net.NetworkModule
import com.ggulcy.androidretrofitexample.data.factory.net.WeatherResponse
import com.ggulcy.androidretrofitexample.domain.WeatherInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
class WeatherRepository constructor(context: Context) {

    fun getWeatherInfo(weatherValue: MutableLiveData<WeatherInfo>, nx: String?, ny: String?){
        var popvalue = ""
        var t3hvalue = ""
        NetworkModule.provideApiService().getWeather(
            serviceKey = NetworkModule.apiKey,
            dataType = "JSON",
            numOfRows = 10,
            pageNo = 1,
            base_date = getCurrentDate(),
            base_time = "0500",
            nx = nx,
            ny = ny
        ).enqueue(
            object: Callback<WeatherResponse> {
                override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                    Log.d("TEST",t.message)
                }

                override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                    response.body()!!.response.body.items.item.let {
                            for (it: WeatherResponse.Response.Item in it){
                                    when(it.category){
                                        "POP"-> popvalue = it.fcstValue.toString()
                                        "T3H"-> t3hvalue = it.fcstValue.toString()
                                    }
                            }
                    }
                    weatherValue.value =
                        WeatherInfo(
                            popvalue,
                            t3hvalue
                        )
                }

            }
        )

    }

    private fun getCurrentDate(): String {
        var now = LocalDateTime.now()
        val dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd")
        return now.format(dateFormatter)
    }


}


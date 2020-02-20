package com.ggulcy.androidretrofitexample.presentation

import com.ggulcy.androidretrofitexample.data.repository.CityRepository
import com.ggulcy.androidretrofitexample.data.repository.WeatherRepository
import android.app.Application
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ggulcy.androidretrofitexample.domain.City
import com.ggulcy.androidretrofitexample.domain.WeatherInfo

class WeatherViewModel constructor(application: Application): AndroidViewModel(application) {
    private val cityRepository: CityRepository = CityRepository()
    @RequiresApi(Build.VERSION_CODES.O)
    private val weatherRepository: WeatherRepository = WeatherRepository(application.applicationContext)

    var weatherValue = MutableLiveData<WeatherInfo>()
    var cityValue = MutableLiveData<List<City>>().apply { value = cityRepository.getCities() }
    var cityName = MutableLiveData<String>().apply { value = "" }


    @RequiresApi(Build.VERSION_CODES.O)
    fun setWeather(nx:String, ny:String){
       weatherRepository.getWeatherInfo(weatherValue, nx, ny)
    }


    fun setCityName(name:String){
        cityName.value = name
    }



}
package com.ggulcy.androidretrofitexample.presentation

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ggulcy.androidretrofitexample.R
import kotlinx.android.synthetic.main.activity_weather.*

class WeatherActivity : AppCompatActivity() {

    private val weatherListAdapter =
        WeatherListAdapter()
    private lateinit var weatherViewModel: WeatherViewModel

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        weatherViewModel =
            ViewModelProviders.of(this).get(
                WeatherViewModel(
                    application
                )::class.java)

        setViewModelObserver()
        recycler_view.adapter = weatherListAdapter.apply {
            onItemClick = {
                weatherViewModel.setWeather(it.nx, it.ny)
                weatherViewModel.setCityName(it.name)
            }
        }



    }

    fun setViewModelObserver(){
        weatherViewModel.weatherValue.observe(this, Observer {
            tv_pop.text = "강수 확률 ${it.POP} %"
            tv_t3h.text = "현재 온도 ${it.T3H} 도"

        })
        weatherViewModel.cityValue.observe(this, Observer {
            weatherListAdapter.collection = it
        })
        weatherViewModel.cityName.observe(this, Observer {
            tv_city_name.text = "< ${it} >의 날씨 정보"
        })

    }


}


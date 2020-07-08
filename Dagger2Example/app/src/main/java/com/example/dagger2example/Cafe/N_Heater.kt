package com.example.dagger2example.Cafe

import android.util.Log


class N_Heater {

    private var heating = false
    fun on() {
        Log.d("D2Test","A_Heater : ~~~ heating ~~~")
        heating = true
    }

    fun off() {
        heating = false
    }

    fun isHot(): Boolean {
        return heating
    }

}
package com.example.dagger2example.Coffee.model

import android.util.Log


class A_Heater: Heater {


    init {
        Log.d("D2Test","Init Heater")
    }
    private var heating:Boolean = false

    override fun on() {
        Log.d("D2Test","A_Heater : ~~~ heating ~~~")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean {
        return heating
    }

}
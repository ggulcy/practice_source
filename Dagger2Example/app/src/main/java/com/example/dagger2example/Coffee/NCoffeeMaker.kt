package com.example.dagger2example.Coffee

import android.util.Log
import com.example.dagger2example.Coffee.model.Heater
import com.example.dagger2example.Coffee.model.Pump


class NCoffeeMaker constructor(heater: Heater, pump: Pump){
    private val heater = heater
    private val pump = pump

    fun brew(){
        heater.on()
        pump.pump()
        Log.d("D2Test"," [ _ ]P coffee! [ _ ]P ")
        heater.off()
    }

}
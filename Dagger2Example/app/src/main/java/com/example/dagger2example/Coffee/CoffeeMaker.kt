package com.example.dagger2example.Coffee

import android.util.Log
import com.example.dagger2example.Coffee.model.Heater
import com.example.dagger2example.Coffee.model.Pump
import javax.inject.Inject


class CoffeeMaker @Inject constructor(val heater:Heater, private val pump: Pump){

    fun brew(){
        heater.on()
        pump.pump()
        Log.d("D2Test"," [ _ ]P coffee! [ _ ]P ")
        heater.off()
    }
}
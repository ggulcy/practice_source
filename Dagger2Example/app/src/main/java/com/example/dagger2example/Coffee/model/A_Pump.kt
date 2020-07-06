package com.example.dagger2example.Coffee.model

import android.util.Log
import javax.inject.Inject


class A_Pump @Inject constructor(private val heater: Heater): Pump {


    override fun pump() {
        Log.d("D2Test",heater.isHot().toString())
        if(heater.isHot()) Log.d("D2Test","A_Pump => => pumping => =>")
    }

}
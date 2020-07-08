package com.example.dagger2example.Cafe

import com.example.dagger2example.Coffee.model.Heater
import javax.inject.Inject


class N_CoffeeMaker @Inject constructor(private val heater: N_Heater){
    fun brew(coffeeBean: CoffeeBean){
        println("${coffeeBean.name()} [__]p coffee!!")
    }
}
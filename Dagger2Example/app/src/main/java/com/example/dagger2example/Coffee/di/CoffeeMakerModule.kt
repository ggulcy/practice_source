package com.example.dagger2example.Coffee.di

import com.example.dagger2example.Coffee.CoffeeMaker
import com.example.dagger2example.Coffee.model.A_Heater
import com.example.dagger2example.Coffee.model.A_Pump
import com.example.dagger2example.Coffee.model.Heater
import com.example.dagger2example.Coffee.model.Pump
import dagger.Module
import dagger.Provides


@Module
class CoffeeMakerModule{
    @Provides
    fun provideHeater():Heater = A_Heater()

    @Provides
    fun providePump(heater: Heater):Pump = A_Pump(heater)

//    @Provides
//    fun provideCoffeeMaker(heater: Heater,pump: Pump) = CoffeeMaker(heater,pump)
}
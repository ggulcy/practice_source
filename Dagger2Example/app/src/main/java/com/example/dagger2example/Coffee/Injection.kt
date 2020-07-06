package com.example.dagger2example.Coffee

import com.example.dagger2example.Coffee.model.A_Heater
import com.example.dagger2example.Coffee.model.A_Pump
import com.example.dagger2example.Coffee.model.Heater


class Injection{
    companion object{
        private fun provideHeater(): Heater =
            A_Heater()
        private fun providePump(heater: Heater) =
            A_Pump(heater)
        fun provideCoffeeMaker(): NCoffeeMaker {
            var heater =
                provideHeater()
            return NCoffeeMaker(heater, providePump(heater))
        }
    }
}
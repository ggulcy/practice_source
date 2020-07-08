package com.example.dagger2example.Cafe

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class CafeModule {
    @Singleton
    @Provides
    fun provideCafeInfo():CafeInfo = CafeInfo()

    @Provides
    fun provideCoffeeMaker(heater: N_Heater) = N_CoffeeMaker(heater)

    @Provides
    fun provideHeather() = N_Heater()

}
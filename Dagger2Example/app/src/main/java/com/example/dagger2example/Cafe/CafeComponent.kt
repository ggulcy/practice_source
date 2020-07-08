package com.example.dagger2example.Cafe

import com.example.dagger2example.Coffee.CoffeeMaker
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [CafeModule::class])
interface CafeComponent{
    fun cafeInfo():CafeInfo
    fun coffeeMaker():N_CoffeeMaker
}
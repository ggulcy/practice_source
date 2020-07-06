package com.example.dagger2example.Coffee.di

import com.example.dagger2example.Coffee.CoffeeMaker
import dagger.Component


@Component(modules = [CoffeeMakerModule::class])
interface CoffeeMakerComponent {
    //provision method
    fun make():CoffeeMaker

    //member-injection method
    fun inject(coffeeMaker: CoffeeMaker)
}
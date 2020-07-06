package com.example.dagger2example.Chef.di

import com.example.dagger2example.MainActivity
import dagger.Component


@Component(modules = [ChefModule::class , KitchenModule::class])
interface Component{
    fun inject(activity: MainActivity)
}
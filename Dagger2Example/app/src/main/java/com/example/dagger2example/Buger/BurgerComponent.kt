package com.example.dagger2example.Buger

import com.example.dagger2example.MainActivity
import dagger.Component

@Component(modules = [BurgerModule::class])
interface BurgerComponent {
//    fun inject(activity: MainActivity)
}
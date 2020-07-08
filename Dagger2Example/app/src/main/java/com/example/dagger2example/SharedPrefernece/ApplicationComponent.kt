package com.example.dagger2example.SharedPrefernece

import com.example.dagger2example.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent{
//    fun inject(activity: MainActivity)
}




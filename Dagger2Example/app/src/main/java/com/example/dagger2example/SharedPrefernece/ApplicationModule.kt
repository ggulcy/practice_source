package com.example.dagger2example.SharedPrefernece

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule constructor(app:Application){


    private val app = app

    @Provides
    @Singleton
    fun provideSharedPrefs(): SharedPreferences = app.applicationContext.getSharedPreferences("PREF", Context.MODE_PRIVATE)





}

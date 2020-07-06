package com.example.dagger2example.Chef.di

import com.example.dagger2example.Chef.Chef
import com.example.dagger2example.Chef.Kitchen
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class KitchenModule {


    @Provides
    fun provideIsOrder(chef:Chef, @Named("course1") order:String) = Kitchen(chef,order)

    @Provides
    @Named("course1")
    fun provideCourse1():String = "한식"

    @Provides
    @Named("course2")
    fun provideCourse2():String = "중식"
}
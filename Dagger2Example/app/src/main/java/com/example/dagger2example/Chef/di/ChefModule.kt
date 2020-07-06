package com.example.dagger2example.Chef.di

import com.example.dagger2example.Chef.Chef
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class ChefModule {
    @Provides
    fun provideChef():Chef = Chef("Black","Jin")

}
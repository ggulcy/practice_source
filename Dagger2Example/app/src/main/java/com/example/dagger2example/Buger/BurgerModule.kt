package com.example.dagger2example.Buger

import dagger.Module
import dagger.Provides


@Module
class BurgerModule{
    @Provides
    fun provideBurger(bun: Burger.WheatBun, patty: Burger.BeefPatty): Burger {
        return Burger(bun, patty)
    }


    @Provides
    fun provideBun(): Burger.WheatBun{
        return Burger.WheatBun()
    }

    @Provides
    fun providePatty(): Burger.BeefPatty{
        return Burger.BeefPatty()
    }



}
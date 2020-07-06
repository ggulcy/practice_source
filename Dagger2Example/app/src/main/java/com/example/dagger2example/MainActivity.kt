package com.example.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger2example.Chef.Kitchen
import com.example.dagger2example.Chef.di.DaggerComponent
import com.example.dagger2example.Coffee.Injection
import com.example.dagger2example.Coffee.di.DaggerCoffeeMakerComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
//    @Inject lateinit var buger: Buger


    @Inject lateinit var kitchen: Kitchen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var component = DaggerBugerComponent.builder()
//            .bugerModule(BugerModule()).build()
//        component.inject(this)


//        DaggerCoffeeMakerComponent.create().make().brew()

//        var heater = A_Heater()
//        var pump = A_Pump(heater)

//
//        var coffeemaker = CoffeMaker(heater,pump)
//        coffeemaker.brew()

//        Injection.provideCoffeeMaker().brew()

        var component = DaggerComponent.builder().build()
        component.inject(this)

        if(kitchen.isOrder()) Log.d("D2Test","order successful")
        else Log.d("D2Test","order fail")

    }
}
package com.example.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2example.Coffee.Injection
import com.example.dagger2example.Coffee.di.DaggerCoffeeMakerComponent

class MainActivity : AppCompatActivity() {
//    @Inject lateinit var buger: Buger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var component = DaggerBugerComponent.builder()
//            .bugerModule(BugerModule()).build()
//        component.inject(this)


        DaggerCoffeeMakerComponent.create().make().brew()

//        var heater = A_Heater()
//        var pump = A_Pump(heater)

//
//        var coffeemaker = CoffeMaker(heater,pump)
//        coffeemaker.brew()

//        Injection.provideCoffeeMaker().brew()




    }
}
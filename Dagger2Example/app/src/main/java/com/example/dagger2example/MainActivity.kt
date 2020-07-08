package com.example.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2example.Cafe.DaggerCafeComponent
import com.example.dagger2example.Coffee.di.DaggerCoffeeMakerComponent

class MainActivity : AppCompatActivity() {
//    @Inject lateinit var buger: Buger


//    @Inject lateinit var kitchen: Kitchen

//    @Inject
//    lateinit var sf:SharedPreferences


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

//        var component = DaggerComponent.builder().build()
//        component.inject(this)
//
//        if(kitchen.isOrder()) Log.d("D2Test","order successful")
//        else Log.d("D2Test","order fail")

//        (application as DemoApplication).component.inject(this)
//
//
//        sf.edit()
//            .putString("status","success")
//            .apply()
//
//
//
//        var str:String? = sf.getString("status","null")
//        Log.d("D2Test",str.toString())


        var cafeComponent = DaggerCafeComponent.create()

        var cafeInfo1 = cafeComponent.cafeInfo()
        var cafeInfo2 = cafeComponent.cafeInfo()


        var coffeeMaker1 = cafeComponent.coffeeMaker()
        var coffeeMaker2 = cafeComponent.coffeeMaker()




    }
}
package com.example.dagger2example.Chef

import android.util.Log


class Kitchen constructor(private val chef: Chef , private val order:String){
    fun isOrder():Boolean{
        return if(!order.isBlank()){
            Log.d("D2Test","Chef : $chef , order : $order")
            true
        } else false
    }
}
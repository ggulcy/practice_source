package com.example.mvvm.viewModel

import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvc.model.Bugger
import com.example.mvc.model.Recipe


class MainViewModel constructor(): ViewModel(){

    private var bugger = Bugger()

    fun getResult(param1:String , param2:String):LiveData<String>{
        bugger.apply {


            when(param1){
                Recipe.Petty.BEEF.name -> petty = Recipe.Petty.BEEF
                Recipe.Petty.PORK.name -> petty = Recipe.Petty.PORK
                Recipe.Petty.CHICKEN.name -> petty = Recipe.Petty.CHICKEN
            }
            when(param2){
                Recipe.Bread.WHITE.name -> bread = Recipe.Bread.WHITE
                Recipe.Bread.WHEAT.name -> bread = Recipe.Bread.WHEAT
                Recipe.Bread.PLAT.name -> bread = Recipe.Bread.PLAT
            }

        }
         return MutableLiveData<String>().apply {
            value = "${bugger.bread} 빵의 ${bugger.petty} 햄버거가 만들어졌습니다"
        }
    }

}

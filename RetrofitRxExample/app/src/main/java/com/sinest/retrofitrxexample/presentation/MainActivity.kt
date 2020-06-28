package com.sinest.retrofitrxexample.presentation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.jakewharton.rxbinding3.view.clicks
import com.sinest.retrofitrxexample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)


        mainViewModel.getLotto(
            onSuccess = {
                textView.text = it[0].toString()
            },onFail = {
                //error
            }
        )
    }

//
//    @SuppressLint("SetTextI18n")
//    fun setObserver(){
//        mainViewModel.numberList.observe(this, Observer {
//            textView.text = "${it[0]} +  ${it[1]}"
//        })
//    }
}
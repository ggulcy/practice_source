package com.example.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.mvvm.R
import com.example.mvvm.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)


        btn_make.setOnClickListener {
            val selectedBugger: RadioButton? = findViewById<RadioButton>(rg_bugger.checkedRadioButtonId)
            val selectedBread: RadioButton? = findViewById<RadioButton>(rg_bread.checkedRadioButtonId)
            mainViewModel.getResult(selectedBugger?.text.toString() , selectedBread?.text.toString()).observe(this@MainActivity,Observer<String>{
                tv_result.text = it.toString()
            })
        }
    }
}

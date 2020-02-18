package com.example.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.mvp.R
import com.example.mvp.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , MainView{

    private val mainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_make.setOnClickListener {
            val selectedBugger:RadioButton = findViewById<RadioButton>(rg_bugger.checkedRadioButtonId)
            val selectedBread:RadioButton = findViewById<RadioButton>(rg_bread.checkedRadioButtonId)
            mainPresenter.getResult(selectedBugger.text.toString(),selectedBread.text.toString())
        }
    }


    override fun showResult(s:String) {
        tv_result.text = s
    }
}

package com.example.androiduipractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val navigator:Navigator = Navigator()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_activity.setOnClickListener { navigator.toButton(this@MainActivity) }
        btn_edittext.setOnClickListener { navigator.toEditText(this@MainActivity) }
        btn_list.setOnClickListener { navigator.toList(this@MainActivity) }
        btn_viewpager.setOnClickListener { navigator.toPager(this@MainActivity) }
        btn_menu.setOnClickListener { navigator.toMenu(this@MainActivity) }

    }
}

package com.example.androiduipractice.UI.Button

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androiduipractice.R
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        btn.setOnClickListener {
                Toast.makeText(this@ButtonActivity,"Button Clicked",Toast.LENGTH_LONG).show()

        }

    }
}
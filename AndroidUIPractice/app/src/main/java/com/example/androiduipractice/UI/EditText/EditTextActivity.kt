package com.example.androiduipractice.UI.EditText

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androiduipractice.R
import kotlinx.android.synthetic.main.activity_edittext.*

class EditTextActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edittext)

        btn.setOnClickListener {

            var text = edit_text.text

            if(text.isNotEmpty())
                Toast.makeText(this@EditTextActivity,text,Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this@EditTextActivity,"Empty text!!",Toast.LENGTH_SHORT).show()
        }




    }
}
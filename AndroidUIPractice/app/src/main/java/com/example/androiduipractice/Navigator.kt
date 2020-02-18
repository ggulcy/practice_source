package com.example.androiduipractice

import android.content.Context
import android.content.Intent
import com.example.androiduipractice.UI.Button.ButtonActivity
import com.example.androiduipractice.UI.EditText.EditTextActivity
import com.example.androiduipractice.UI.Menu.MenuActivity
import com.example.androiduipractice.UI.Recycler.ListActivity
import com.example.androiduipractice.UI.TabViewPager.TabViewPagerActivity


class Navigator {

    fun toButton(context: Context?) {
        if (context != null) {
            var intent = Intent(context, ButtonActivity::class.java)
            context.startActivity(intent)
        }
    }

    fun toEditText(context:Context?){
        if (context != null) {
            var intent = Intent(context, EditTextActivity::class.java)
            context.startActivity(intent)
        }
    }

    fun toList(context:Context?){
        if (context != null) {
            var intent = Intent(context, ListActivity::class.java)
            context.startActivity(intent)
        }
    }

    fun toPager(context: Context?){
        if (context != null) {
            var intent = Intent(context, TabViewPagerActivity::class.java)
            context.startActivity(intent)
        }
    }


    fun toMenu(context: Context?){
        if (context != null) {
            var intent = Intent(context, MenuActivity::class.java)
            context.startActivity(intent)
        }
    }
}
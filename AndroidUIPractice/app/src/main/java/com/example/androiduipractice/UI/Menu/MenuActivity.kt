package com.example.androiduipractice.UI.Menu

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener
import com.example.androiduipractice.R
import kotlinx.android.synthetic.main.actvity_menu.*
import kotlinx.android.synthetic.main.menu_drawer.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_menu)

        ic_menu.setOnClickListener {
            draw_layout.openDrawer(draw_view)
        }

        draw_layout.addDrawerListener(object : DrawerListener {
            override fun onDrawerStateChanged(newState: Int) {
            }

            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
            }

            override fun onDrawerClosed(drawerView: View) {
            }

            override fun onDrawerOpened(drawerView: View) {
            }

        })


        menu1.setOnClickListener {
            Toast.makeText(
                this@MenuActivity,
                "MENU1 Clicked",
                Toast.LENGTH_LONG
            ).show()
        }
        menu2.setOnClickListener {
            Toast.makeText(
                this@MenuActivity,
                "MENU2 Clicked",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
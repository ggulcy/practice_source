package com.example.androiduipractice.UI.TabViewPager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androiduipractice.R
import kotlinx.android.synthetic.main.activity_tabviewpager.*

class TabViewPagerActivity : AppCompatActivity() {

    private val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabviewpager)



        view_pager.apply {
            adapter = viewPagerAdapter
            offscreenPageLimit = viewPagerAdapter.maxCountPage
        }

        main_tab.setupWithViewPager(view_pager)


        for(i in 0 until viewPagerAdapter.maxCountPage){
            var cnt = i+1
            main_tab.getTabAt(i)?.text ="$cnt 번탭"
        }

    }
}
package com.example.androiduipractice.UI.TabViewPager

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.andoridbasicpractice.UI.TabViewPager.TabTwoFragment


class ViewPagerAdapter constructor(fm:FragmentManager): FragmentPagerAdapter(fm) {

    val maxCountPage = 3

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> TabOneFragment.newInstance()
            1 -> TabTwoFragment.newInstance()
            else -> TabThreeFragment.newInstance()
        }
    }

    override fun getCount(): Int  = maxCountPage


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }

}
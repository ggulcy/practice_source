package com.example.androiduipractice.UI.TabViewPager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androiduipractice.R
import kotlinx.android.synthetic.main.fragment_tab.*


class TabThreeFragment  : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tab, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        text_fragment.text = "fragment3"
    }


    companion object {
        fun newInstance(): TabThreeFragment {
            return TabThreeFragment()
        }

    }
}
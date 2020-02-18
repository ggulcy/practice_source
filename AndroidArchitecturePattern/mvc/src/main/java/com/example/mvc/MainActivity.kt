package com.example.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvc.model.Bugger
import com.example.mvc.model.Recipe
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var bugger: Bugger = Bugger()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        rg_bugger.setOnCheckedChangeListener { group, checkedId ->
            bugger.apply {
                when (checkedId) {
                    rb_beef.id -> petty = Recipe.Petty.BEEF
                    rb_pork.id -> petty = Recipe.Petty.PORK
                    rb_chicken.id -> petty = Recipe.Petty.CHICKEN

                }
            }
        }

        rg_bread.setOnCheckedChangeListener { group, checkedId ->
            bugger.apply {
                when (checkedId) {
                    rb_white.id -> bread = Recipe.Bread.WHITE
                    rb_wheat.id -> bread = Recipe.Bread.WHEAT
                    rb_plat.id -> bread = Recipe.Bread.PLAT
                }

            }
        }



        btn_make.setOnClickListener {


            tv_result.run {
                when {
                    bugger.petty == null -> text = "petty를 선택해주세요 "
                    bugger.bread == null -> text = "bread를 선택해주세요"
                    else -> text = bugger.bread.toString() + " 빵의 " + bugger.petty.toString() + " 햄버거가 만들어졌습니다"

                }
            }
        }
    }
}

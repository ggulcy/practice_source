package com.example.androiduipractice.UI.Recycler

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androiduipractice.R
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity(){

    private var listAdapter:ListAdapter  = ListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)



        recycler_view.adapter = listAdapter.apply {
            onItemClick = {
                Toast.makeText(this@ListActivity, it.title+"을 눌렀습니다",Toast.LENGTH_LONG).show()
            }
        }

        listAdapter.collection = setData()


        btn_add.setOnClickListener {
            listAdapter.addItem(
                addData()
            )
        }



    }



    fun setData() : MutableList<ListItem>{
        var items = mutableListOf<ListItem>()
        items.let {
            it.add(ListItem("오늘의 뉴스 속보", "남북정상회담"))
            it.add(ListItem("오늘의 날씨 예보", "춤습니다"))
            it.add(ListItem("오늘의 야구 소식", "SK 또 패배"))
        }
        return items
    }


    fun addData():MutableList<ListItem>{
        var itmes = mutableListOf<ListItem>()
        itmes.add(ListItem("리스트 더하기","리스트더하기"))
        return itmes
    }



}
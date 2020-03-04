package com.ggulcy.codingtest

import org.junit.Test
import java.text.SimpleDateFormat
import java.util.*
import kotlin.random.Random

class 이천십육년 {

    @Test
    fun main() {
        var a = 1
        var b = 3
        var answer = ""

        var arrWeek = arrayOf("FRI","SAT","SUN","MON","TUE","WED","THU")
        var arrLastDate = arrayOf(31,29,31,30,31,30,31,31,30,31,30,31)
        var allDay = 0
        for(i in 0 until a-1){
            allDay += arrLastDate[i]
        }
        allDay += (b-1)

        answer = arrWeek[(allDay%arrWeek.size)]


        print(answer)


    }


}



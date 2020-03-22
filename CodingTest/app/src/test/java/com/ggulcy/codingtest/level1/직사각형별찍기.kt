package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 직사각형별찍기 {
    @Test
    fun addition_isCorrect() {

        var a = 5
        var b = 3


        for(i in 0 until b){
            for(j in 0 until a){
                print("*")
            }
            if(i != b-1) print("\n")
        }




    }
}

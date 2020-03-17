package com.ggulcy.codingtest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 문자열내림차순배치 {

    @Test
    fun main(){
        var s = "Zbcdefg"



    }

    fun test(s : String) : String = with(s){
        toList().sorted().reversed().joinToString (separator = "")
    }

}

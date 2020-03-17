package com.ggulcy.codingtest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 두정수의합 {
    @Test
    fun main() {

        var a = 5
        var b= 3

        var answer:Long = 0

        if(a>=b) for(i in b..a) answer+=i
        else for(i in a..b) answer+=i


        println(answer)

    }
}

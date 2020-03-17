package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 수박수박수박 {
    @Test
    fun main() {
        var n = 3

        var answer = ""
        for(i in 0 until n) {
            answer += if(i % 2 == 1) "박"
            else "수"
        }


    }
}

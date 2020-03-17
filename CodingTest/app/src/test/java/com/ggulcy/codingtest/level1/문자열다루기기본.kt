package com.ggulcy.codingtest.level1

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 문자열다루기기본 {
    @Test
    fun main() {

        var s = "12a1"
        var answer = false
        if (s.length == 4 || s.length == 6) {
            for (ss in s) {
                if (ss.toInt() in 48..57) answer = true
                else {
                    answer = false
                    break
                }
            }
        } else answer = false


        print(answer.toString())
    }
}


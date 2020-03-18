package com.ggulcy.codingtest.level1

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 자릿수더하기 {
    @Test
    fun main() {

        var n = 123
        var answer = 0

        for(c in n.toString()) answer+=Integer.parseInt(c.toString())


    }
}

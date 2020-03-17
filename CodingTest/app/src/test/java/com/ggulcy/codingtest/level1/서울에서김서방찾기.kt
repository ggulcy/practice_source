package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 서울에서김서방찾기 {
    @Test
    fun main() {
        var seoul = listOf<String>("HAHAH","HOHO","KIM")


        var answer = "김서방은"+seoul.indexOf("KIM")+"에 있다"

        print(answer)

    }
}

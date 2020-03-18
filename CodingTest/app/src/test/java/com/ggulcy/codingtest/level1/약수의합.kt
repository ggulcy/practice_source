package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 약수의합 {
    @Test
    fun main() {
        var n = 1

        var answer = 0

        for(i in 1..n) if(n%i == 0) answer+= i



        print(answer)

    }
}

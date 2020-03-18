package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 정수제곱근판별 {
    @Test
    fun main() {

        var n:Long = 0


        var answer = if(sqrt(n.toDouble()).pow(2) == n.toDouble() && n != 0L) (sqrt(n.toDouble())+1).pow(2).toLong() else -1

        print(answer)
    }
}
